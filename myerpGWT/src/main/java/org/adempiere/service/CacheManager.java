package org.adempiere.service;

import java.util.Map;

import com.google.common.base.Function;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.gwt.thirdparty.guava.common.collect.Maps;

@SuppressWarnings("rawtypes")
public class CacheManager {

    private static Map<CacheSpec, CacheGroup> cacheMap = Maps.newConcurrentMap();

    public static LoadingCache getCache(CacheClass cacheClass) {
        return getCache(cacheClass, 0);
    }

    public static LoadingCache getCache(CacheClass cacheClass, Object cacheID) {
        CacheGroup cacheGroup = getCacheGroup(cacheClass, cacheID);
        return null != cacheGroup ? cacheGroup.cache : null;
    }

    public static <K, V> LoadingCache<K, V> buildCache(CacheClass cacheClass, Loader loader) {
        return buildCache(cacheClass, 0, loader);
    }

    @SuppressWarnings("unchecked")
    public static <K, V> LoadingCache<K, V> buildCache(CacheClass cacheClass, Object cacheID, Loader loader) {
        LoadingCache cache = getCache(cacheClass, cacheID);
        if (null != cache) {
            return cache;
        }
        loader.reset();
        cache = CacheBuilder.newBuilder().build(CacheLoader.from(loader));
        cacheMap.put(new CacheSpec(cacheClass, cacheID), new CacheGroup(loader, cache));
        return cache;
    }

    private static CacheGroup getCacheGroup(CacheClass cacheClass, Object cacheID) {
        return cacheMap.get(new CacheSpec(cacheClass, cacheID));
    }

    public static void invalidate(CacheClass cacheClass, Object cacheID, Object key) {
        CacheGroup cacheGroup = getCacheGroup(cacheClass, cacheID);
        if (null != cacheGroup) {
            cacheGroup.cache.invalidate(key);
            cacheGroup.loader.reset();
        }
    }

    public static void invalidateAll(CacheClass cacheClass, Object cacheID) {
        CacheGroup cacheGroup = getCacheGroup(cacheClass, cacheID);
        if (null != cacheGroup) {
            cacheGroup.cache.invalidateAll();
            cacheGroup.loader.reset();
        }
    }

    public static void invalidateAll() {
        for (CacheGroup cacheGroup : cacheMap.values()) {
            cacheGroup.cache.invalidateAll();
            cacheGroup.loader.reset();
        }
    }

    public static interface Loader<F, T> extends Function<F, T> {

        void reset();
    }

    static class CacheGroup {

        public final Loader loader;
        public final LoadingCache  cache;

        public CacheGroup(Loader loader, LoadingCache cache){
            super();
            this.loader = loader;
            this.cache = cache;
        }
    }

    static class CacheSpec {

        public CacheClass cacheClass = CacheClass.Unknown;
        public Object     cacheID    = 0;

        public CacheSpec(CacheClass cacheClass, Object cacheID){
            super();
            this.cacheClass = cacheClass;
            this.cacheID = cacheID;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((cacheClass == null) ? 0 : cacheClass.hashCode());
            result = prime * result + ((cacheID == null) ? 0 : cacheID.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null) return false;
            if (getClass() != obj.getClass()) return false;
            CacheSpec other = (CacheSpec) obj;
            if (cacheClass != other.cacheClass) return false;
            if (cacheID == null) {
                if (other.cacheID != null) return false;
            } else if (!cacheID.equals(other.cacheID)) return false;
            return true;
        }

    }

    public static enum CacheClass {
        Menu(10), Unknown(99);

        private int value;

        CacheClass(int value){
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

}
