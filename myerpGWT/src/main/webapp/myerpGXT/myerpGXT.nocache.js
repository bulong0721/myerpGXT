function myerpGXT(){
  var $wnd_0 = window, $doc_0 = document, $stats = $wnd_0.__gwtStatsEvent?function(a){
    return $wnd_0.__gwtStatsEvent(a);
  }
  :null, $sessionId_0 = $wnd_0.__gwtStatsSessionId?$wnd_0.__gwtStatsSessionId:null, scriptsDone, loadDone, bodyDone, base = '', metaProps = {}, values = [], providers = [], answers = [], softPermutationId = 0, onLoadErrorFunc, propertyErrorFunc;
  $stats && $stats({moduleName:'myerpGXT', sessionId:$sessionId_0, subSystem:'startup', evtGroup:'bootstrap', millis:(new Date).getTime(), type:'begin'});
  if (!$wnd_0.__gwt_stylesLoaded) {
    $wnd_0.__gwt_stylesLoaded = {};
  }
  if (!$wnd_0.__gwt_scriptsLoaded) {
    $wnd_0.__gwt_scriptsLoaded = {};
  }
  function isHostedMode(){
    var result = false;
    try {
      var query = $wnd_0.location.search;
      return (query.indexOf('gwt.codesvr=') != -1 || (query.indexOf('gwt.hosted=') != -1 || $wnd_0.external && $wnd_0.external.gwtOnLoad)) && query.indexOf('gwt.hybrid') == -1;
    }
     catch (e) {
    }
    isHostedMode = function(){
      return result;
    }
    ;
    return result;
  }

  function maybeStartModule(){
    if (scriptsDone && loadDone) {
      var iframe = $doc_0.getElementById('myerpGXT');
      var frameWnd = iframe.contentWindow;
      if (isHostedMode()) {
        frameWnd.__gwt_getProperty = function(name_0){
          return computePropValue(name_0);
        }
        ;
      }
      myerpGXT = null;
      frameWnd.gwtOnLoad(onLoadErrorFunc, 'myerpGXT', base, softPermutationId);
      $stats && $stats({moduleName:'myerpGXT', sessionId:$sessionId_0, subSystem:'startup', evtGroup:'moduleStartup', millis:(new Date).getTime(), type:'end'});
    }
  }

  function computeScriptBase(){
    function getDirectoryOfFile(path){
      var hashIndex = path.lastIndexOf('#');
      if (hashIndex == -1) {
        hashIndex = path.length;
      }
      var queryIndex = path.indexOf('?');
      if (queryIndex == -1) {
        queryIndex = path.length;
      }
      var slashIndex = path.lastIndexOf('/', Math.min(queryIndex, hashIndex));
      return slashIndex >= 0?path.substring(0, slashIndex + 1):'';
    }

    function ensureAbsoluteUrl(url){
      if (url.match(/^\w+:\/\//)) {
      }
       else {
        var img = $doc_0.createElement('img');
        img.src = url + 'clear.cache.gif';
        url = getDirectoryOfFile(img.src);
      }
      return url;
    }

    function tryMetaTag(){
      var metaVal = __gwt_getMetaProperty('baseUrl');
      if (metaVal != null) {
        return metaVal;
      }
      return '';
    }

    function tryNocacheJsTag(){
      var scriptTags = $doc_0.getElementsByTagName('script');
      for (var i = 0; i < scriptTags.length; ++i) {
        if (scriptTags[i].src.indexOf('myerpGXT.nocache.js') != -1) {
          return getDirectoryOfFile(scriptTags[i].src);
        }
      }
      return '';
    }

    function tryMarkerScript(){
      var thisScript;
      if (typeof isBodyLoaded == 'undefined' || !isBodyLoaded()) {
        var markerId = '__gwt_marker_myerpGXT';
        var markerScript;
        $doc_0.write('<script id="' + markerId + '"><\/script>');
        markerScript = $doc_0.getElementById(markerId);
        thisScript = markerScript && markerScript.previousSibling;
        while (thisScript && thisScript.tagName != 'SCRIPT') {
          thisScript = thisScript.previousSibling;
        }
        if (markerScript) {
          markerScript.parentNode.removeChild(markerScript);
        }
        if (thisScript && thisScript.src) {
          return getDirectoryOfFile(thisScript.src);
        }
      }
      return '';
    }

    function tryBaseTag(){
      var baseElements = $doc_0.getElementsByTagName('base');
      if (baseElements.length > 0) {
        return baseElements[baseElements.length - 1].href;
      }
      return '';
    }

    function isLocationOk(){
      var loc = $doc_0.location;
      return loc.href == loc.protocol + '//' + loc.host + loc.pathname + loc.search + loc.hash;
    }

    var tempBase = tryMetaTag();
    if (tempBase == '') {
      tempBase = tryNocacheJsTag();
    }
    if (tempBase == '') {
      tempBase = tryMarkerScript();
    }
    if (tempBase == '') {
      tempBase = tryBaseTag();
    }
    if (tempBase == '' && isLocationOk()) {
      tempBase = getDirectoryOfFile($doc_0.location.href);
    }
    tempBase = ensureAbsoluteUrl(tempBase);
    base = tempBase;
    return tempBase;
  }

  function processMetas(){
    var metas = document.getElementsByTagName('meta');
    for (var i = 0, n = metas.length; i < n; ++i) {
      var meta = metas[i], name_0 = meta.getAttribute('name'), content_0;
      if (name_0) {
        name_0 = name_0.replace('myerpGXT::', '');
        if (name_0.indexOf('::') >= 0) {
          continue;
        }
        if (name_0 == 'gwt:property') {
          content_0 = meta.getAttribute('content');
          if (content_0) {
            var value, eq = content_0.indexOf('=');
            if (eq >= 0) {
              name_0 = content_0.substring(0, eq);
              value = content_0.substring(eq + 1);
            }
             else {
              name_0 = content_0;
              value = '';
            }
            metaProps[name_0] = value;
          }
        }
         else if (name_0 == 'gwt:onPropertyErrorFn') {
          content_0 = meta.getAttribute('content');
          if (content_0) {
            try {
              propertyErrorFunc = eval(content_0);
            }
             catch (e) {
              alert('Bad handler "' + content_0 + '" for "gwt:onPropertyErrorFn"');
            }
          }
        }
         else if (name_0 == 'gwt:onLoadErrorFn') {
          content_0 = meta.getAttribute('content');
          if (content_0) {
            try {
              onLoadErrorFunc = eval(content_0);
            }
             catch (e) {
              alert('Bad handler "' + content_0 + '" for "gwt:onLoadErrorFn"');
            }
          }
        }
      }
    }
  }

  function __gwt_getMetaProperty(name_0){
    var value = metaProps[name_0];
    return value == null?null:value;
  }

  function unflattenKeylistIntoAnswers(propValArray, value){
    var answer = answers;
    for (var i = 0, n = propValArray.length - 1; i < n; ++i) {
      answer = answer[propValArray[i]] || (answer[propValArray[i]] = []);
    }
    answer[propValArray[n]] = value;
  }

  function computePropValue(propName){
    var value = providers[propName](), allowedValuesMap = values[propName];
    if (value in allowedValuesMap) {
      return value;
    }
    var allowedValuesList = [];
    for (var k in allowedValuesMap) {
      allowedValuesList[allowedValuesMap[k]] = k;
    }
    if (propertyErrorFunc) {
      propertyErrorFunc(propName, allowedValuesList, value);
    }
    throw null;
  }

  var frameInjected;
  function maybeInjectFrame(){
    if (!frameInjected) {
      frameInjected = true;
      var iframe = $doc_0.createElement('iframe');
      iframe.src = "javascript:''";
      iframe.id = 'myerpGXT';
      iframe.style.cssText = 'position:absolute;width:0;height:0;border:none';
      iframe.tabIndex = -1;
      $doc_0.body.appendChild(iframe);
      $stats && $stats({moduleName:'myerpGXT', sessionId:$sessionId_0, subSystem:'startup', evtGroup:'moduleStartup', millis:(new Date).getTime(), type:'moduleRequested'});
      iframe.contentWindow.location.replace(base + initialHtml);
    }
  }

  providers['gxt.user.agent'] = function(){
    var ua = navigator.userAgent.toLowerCase();
    if (ua.indexOf('chrome') != -1)
      return 'chrome';
    if (ua.indexOf('opera') != -1)
      return 'opera';
    if (ua.indexOf('msie') != -1) {
      if (ua.indexOf('msie 6') != -1)
        return 'ie6';
      if (ua.indexOf('msie 7') != -1)
        return 'ie7';
      if (ua.indexOf('msie 8') != -1)
        return 'ie8';
      return 'ie9';
    }
    if (ua.indexOf('safari') != -1) {
      if (ua.indexOf('version/3') != -1)
        return 'safari3';
      if (ua.indexOf('version/4') != -1)
        return 'safari4';
      return 'safari5';
    }
    if (ua.indexOf('gecko') != -1) {
      if (ua.indexOf('rv:1.8') != -1)
        return 'gecko1_8';
      return 'gecko1_9';
    }
    if (ua.indexOf('adobeair') != -1)
      return 'air';
    return null;
  }
  ;
  values['gxt.user.agent'] = {air:0, chrome:1, gecko1_8:2, gecko1_9:3, ie6:4, ie7:5, ie8:6, ie9:7, opera:8, safari3:9, safari4:10, safari5:11};
  providers['user.agent.os'] = function(){
    var ua = $wnd_0.navigator.userAgent.toLowerCase();
    if (ua.indexOf('macintosh') != -1 || ua.indexOf('mac os x') != -1) {
      return 'mac';
    }
    if (ua.indexOf('linux') != -1) {
      return 'linux';
    }
    if (ua.indexOf('windows') != -1 || ua.indexOf('win32') != -1) {
      return 'windows';
    }
    return 'unknown';
  }
  ;
  values['user.agent.os'] = {linux:0, mac:1, windows:2};
  myerpGXT.onScriptLoad = function(){
    if (frameInjected) {
      loadDone = true;
      maybeStartModule();
    }
  }
  ;
  myerpGXT.onInjectionDone = function(){
    scriptsDone = true;
    $stats && $stats({moduleName:'myerpGXT', sessionId:$sessionId_0, subSystem:'startup', evtGroup:'loadExternalRefs', millis:(new Date).getTime(), type:'end'});
    maybeStartModule();
  }
  ;
  processMetas();
  computeScriptBase();
  var strongName;
  var initialHtml;
  if (isHostedMode()) {
    if ($wnd_0.external && ($wnd_0.external.initModule && $wnd_0.external.initModule('myerpGXT'))) {
      $wnd_0.location.reload();
      return;
    }
    initialHtml = 'hosted.html?myerpGXT';
    strongName = '';
  }
  $stats && $stats({moduleName:'myerpGXT', sessionId:$sessionId_0, subSystem:'startup', evtGroup:'bootstrap', millis:(new Date).getTime(), type:'selectingPermutation'});
  if (!isHostedMode()) {
    try {
      unflattenKeylistIntoAnswers(['air', 'linux'], '15594456C11B91A05D6CA2DD80C5193C');
      unflattenKeylistIntoAnswers(['air', 'mac'], '15594456C11B91A05D6CA2DD80C5193C' + ':1');
      unflattenKeylistIntoAnswers(['safari4', 'mac'], '15594456C11B91A05D6CA2DD80C5193C' + ':10');
      unflattenKeylistIntoAnswers(['safari4', 'windows'], '15594456C11B91A05D6CA2DD80C5193C' + ':11');
      unflattenKeylistIntoAnswers(['safari5', 'linux'], '15594456C11B91A05D6CA2DD80C5193C' + ':12');
      unflattenKeylistIntoAnswers(['safari5', 'mac'], '15594456C11B91A05D6CA2DD80C5193C' + ':13');
      unflattenKeylistIntoAnswers(['safari5', 'windows'], '15594456C11B91A05D6CA2DD80C5193C' + ':14');
      unflattenKeylistIntoAnswers(['air', 'windows'], '15594456C11B91A05D6CA2DD80C5193C' + ':2');
      unflattenKeylistIntoAnswers(['chrome', 'linux'], '15594456C11B91A05D6CA2DD80C5193C' + ':3');
      unflattenKeylistIntoAnswers(['chrome', 'mac'], '15594456C11B91A05D6CA2DD80C5193C' + ':4');
      unflattenKeylistIntoAnswers(['chrome', 'windows'], '15594456C11B91A05D6CA2DD80C5193C' + ':5');
      unflattenKeylistIntoAnswers(['safari3', 'linux'], '15594456C11B91A05D6CA2DD80C5193C' + ':6');
      unflattenKeylistIntoAnswers(['safari3', 'mac'], '15594456C11B91A05D6CA2DD80C5193C' + ':7');
      unflattenKeylistIntoAnswers(['safari3', 'windows'], '15594456C11B91A05D6CA2DD80C5193C' + ':8');
      unflattenKeylistIntoAnswers(['safari4', 'linux'], '15594456C11B91A05D6CA2DD80C5193C' + ':9');
      unflattenKeylistIntoAnswers(['gecko1_8', 'linux'], '5DE0A0C99BCE69A78A9466F30270B24A');
      unflattenKeylistIntoAnswers(['gecko1_8', 'mac'], '5DE0A0C99BCE69A78A9466F30270B24A' + ':1');
      unflattenKeylistIntoAnswers(['gecko1_8', 'windows'], '5DE0A0C99BCE69A78A9466F30270B24A' + ':2');
      unflattenKeylistIntoAnswers(['gecko1_9', 'linux'], '5DE0A0C99BCE69A78A9466F30270B24A' + ':3');
      unflattenKeylistIntoAnswers(['gecko1_9', 'mac'], '5DE0A0C99BCE69A78A9466F30270B24A' + ':4');
      unflattenKeylistIntoAnswers(['gecko1_9', 'windows'], '5DE0A0C99BCE69A78A9466F30270B24A' + ':5');
      unflattenKeylistIntoAnswers(['opera', 'linux'], '93D5A3A159F262B28BA4E69647CBCE6F');
      unflattenKeylistIntoAnswers(['opera', 'mac'], '93D5A3A159F262B28BA4E69647CBCE6F' + ':1');
      unflattenKeylistIntoAnswers(['opera', 'windows'], '93D5A3A159F262B28BA4E69647CBCE6F' + ':2');
      unflattenKeylistIntoAnswers(['ie6', 'linux'], 'A7AA0E5BAC8CBE2DB6A1456B2AAC99D2');
      unflattenKeylistIntoAnswers(['ie6', 'mac'], 'A7AA0E5BAC8CBE2DB6A1456B2AAC99D2' + ':1');
      unflattenKeylistIntoAnswers(['ie6', 'windows'], 'A7AA0E5BAC8CBE2DB6A1456B2AAC99D2' + ':2');
      unflattenKeylistIntoAnswers(['ie7', 'linux'], 'A7AA0E5BAC8CBE2DB6A1456B2AAC99D2' + ':3');
      unflattenKeylistIntoAnswers(['ie7', 'mac'], 'A7AA0E5BAC8CBE2DB6A1456B2AAC99D2' + ':4');
      unflattenKeylistIntoAnswers(['ie7', 'windows'], 'A7AA0E5BAC8CBE2DB6A1456B2AAC99D2' + ':5');
      unflattenKeylistIntoAnswers(['ie9', 'linux'], 'CC32E2820DEE7E0211FDF693C3F26CD9');
      unflattenKeylistIntoAnswers(['ie9', 'mac'], 'CC32E2820DEE7E0211FDF693C3F26CD9' + ':1');
      unflattenKeylistIntoAnswers(['ie9', 'windows'], 'CC32E2820DEE7E0211FDF693C3F26CD9' + ':2');
      unflattenKeylistIntoAnswers(['ie8', 'linux'], 'FC7A97F58240996701E496594354EA22');
      unflattenKeylistIntoAnswers(['ie8', 'mac'], 'FC7A97F58240996701E496594354EA22' + ':1');
      unflattenKeylistIntoAnswers(['ie8', 'windows'], 'FC7A97F58240996701E496594354EA22' + ':2');
      strongName = answers[computePropValue('gxt.user.agent')][computePropValue('user.agent.os')];
      var idx = strongName.indexOf(':');
      if (idx != -1) {
        softPermutationId = Number(strongName.substring(idx + 1));
        strongName = strongName.substring(0, idx);
      }
      initialHtml = strongName + '.cache.html';
    }
     catch (e) {
      return;
    }
  }
  var onBodyDoneTimerId;
  function onBodyDone(){
    if (!bodyDone) {
      bodyDone = true;
      if (!__gwt_stylesLoaded['reset.css']) {
        var l = $doc_0.createElement('link');
        __gwt_stylesLoaded['reset.css'] = l;
        l.setAttribute('rel', 'stylesheet');
        l.setAttribute('href', base + 'reset.css');
        $doc_0.getElementsByTagName('head')[0].appendChild(l);
      }
      maybeStartModule();
      if ($doc_0.removeEventListener) {
        $doc_0.removeEventListener('DOMContentLoaded', onBodyDone, false);
      }
      if (onBodyDoneTimerId) {
        clearInterval(onBodyDoneTimerId);
      }
    }
  }

  if ($doc_0.addEventListener) {
    $doc_0.addEventListener('DOMContentLoaded', function(){
      maybeInjectFrame();
      onBodyDone();
    }
    , false);
  }
  var onBodyDoneTimerId = setInterval(function(){
    if (/loaded|complete/.test($doc_0.readyState)) {
      maybeInjectFrame();
      onBodyDone();
    }
  }
  , 50);
  $stats && $stats({moduleName:'myerpGXT', sessionId:$sessionId_0, subSystem:'startup', evtGroup:'bootstrap', millis:(new Date).getTime(), type:'end'});
  $stats && $stats({moduleName:'myerpGXT', sessionId:$sessionId_0, subSystem:'startup', evtGroup:'loadExternalRefs', millis:(new Date).getTime(), type:'begin'});
  $doc_0.write('<script defer="defer">myerpGXT.onInjectionDone(\'myerpGXT\')<\/script>');
}

myerpGXT();
