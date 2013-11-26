package org.adempiere.web.client.util;

import java.io.PrintWriter;
import java.util.ArrayList;

import com.google.gwt.core.ext.Generator;
import com.google.gwt.core.ext.GeneratorContext;
import com.google.gwt.core.ext.TreeLogger;
import com.google.gwt.core.ext.UnableToCompleteException;
import com.google.gwt.core.ext.typeinfo.JClassType;
import com.google.gwt.core.ext.typeinfo.NotFoundException;
import com.google.gwt.user.rebind.ClassSourceFileComposerFactory;
import com.google.gwt.user.rebind.SourceWriter;

public class ClassActivatorGenerator extends Generator {

	@Override
	public String generate(TreeLogger logger, GeneratorContext context, String typeName) throws UnableToCompleteException {
		ArrayList<JClassType> activatableClasses = new ArrayList<JClassType>();

		for (JClassType type : context.getTypeOracle().getTypes()) {
			if (type.isAnnotationPresent(Activatable.class)) {
				activatableClasses.add(type);
			}
		}

		JClassType targetType;
		try {
			targetType = context.getTypeOracle().getType(typeName);
		} catch (NotFoundException e) {
			logger.log(TreeLogger.ERROR, "No such type " + typeName, e);
			throw new UnableToCompleteException();
		}
		String generatedClassQualifiedName = targetType.getParameterizedQualifiedSourceName() + "Impl";
		SourceWriter writer = getSourceWriter(logger, context, targetType, activatableClasses);
		if (null != writer) {
			writeFields(writer);
			writeInit(activatableClasses, writer);
			writeNewForString(activatableClasses, writer);
			writeForName(writer);
			writeNewForClass(writer);
			writer.commit(logger);
		}
		return generatedClassQualifiedName;
	}

	private SourceWriter getSourceWriter(TreeLogger logger, GeneratorContext context, JClassType targetType,
			ArrayList<JClassType> activatableClasses) {
		String targetPackageName = targetType.getPackage().getName();
		String targetClassName = targetType.getName() + "Impl";
		PrintWriter printWriter = context.tryCreate(logger, targetPackageName, targetClassName);
		logger.log(TreeLogger.INFO, "Generating writer for " + targetPackageName + "." + targetClassName, null);
		if (printWriter == null) {
			return null;
		}
		ClassSourceFileComposerFactory factory = new ClassSourceFileComposerFactory(targetPackageName, targetClassName);
		factory.addImplementedInterface(targetType.getName());
		factory.addImport("java.util.HashMap");

		for (JClassType type : activatableClasses) {
			String name = type.getPackage().getName() + "." + type.getName();
			factory.addImport(name);
		}

		return factory.createSourceWriter(context, printWriter);
	}

	private void writeFields(SourceWriter writer) {
		writer.println("private HashMap<String, Class> classHashMap = new HashMap<String, Class>();");
		writer.println();
	}

	private void writeInit(ArrayList<JClassType> forNameAbleClassList, SourceWriter writer) {
		writer.println("@Override");
		writer.println("public void init() {");
		writer.indent();
		for (JClassType type : forNameAbleClassList) {
			String name = type.getPackage().getName() + "." + type.getName();
			writer.println("classHashMap.put(\"" + name + "\", " + type.getName() + ".class);");
		}
		writer.outdent();
		writer.println("}");
	}

	private void writeNewForClass(SourceWriter writer) {
		writer.println("@Override");
		writer.println("public <V> V newInstance(Class<V> clazz) {");
		writer.indent();
		writer.println("return newInstance(clazz.getName());");
		writer.outdent();
		writer.println("}");
	}

	private void writeForName(SourceWriter writer) {
		writer.println("@Override");
		writer.println("public <V> Class<V> forName(String name) {");
		writer.indent();
		writer.println("return classHashMap.get(name);");
		writer.outdent();
		writer.println("}");
		writer.println();
	}

	private void writeNewForString(ArrayList<JClassType> forNameAbleClassList, SourceWriter writer) {
		writer.println("@Override");
		writer.println("public <V> V newInstance(String className) {");
		writer.indent();
		writer.println("if (classHashMap.containsKey(className)) {");
		writer.indent();
		for (JClassType type : forNameAbleClassList) {
			String className = type.getPackage().getName() + "." + type.getName();
			writer.println("if (className.equals(\"" + className + "\")) {");
			writer.indent();
			writer.println("return (V) new " + type.getName() + "();");
			writer.outdent();
			writer.println("}");
		}
		writer.outdent();
		writer.println("}");
		writer.println("return null;");
		writer.outdent();
		writer.println("}");
		writer.println();
	}

}
