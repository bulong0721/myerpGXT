package org.adempiere.model.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ADExpression implements Serializable {
	private static final long	serialVersionUID	= 1L;
	private String				columnName;
	private FieldOperator		fieldOperator;
	private String				value1;
	private String				value2;

	public ADExpression() {
	}

	public ADExpression(String columnName) {
		this(columnName, FieldOperator.Equal);
	}

	public ADExpression(String columnName, FieldOperator fieldOperator) {
		this(columnName, fieldOperator, null, null);
	}

	public ADExpression(String columnName, FieldOperator fieldOperator, String value1) {
		this(columnName, fieldOperator, value1, null);
	}

	public ADExpression(String columnName, FieldOperator fieldOperator, String value1, String value2) {
		super();
		this.columnName = columnName;
		this.fieldOperator = fieldOperator;
		this.value1 = value1;
		this.value2 = value2;
	}

	public boolean isParent() {
		return false;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public FieldOperator getFieldOperator() {
		return fieldOperator;
	}

	public void setFieldOperator(FieldOperator fieldOperator) {
		this.fieldOperator = fieldOperator;
	}

	public String getValue1() {
		return value1;
	}

	public void setValue1(String value1) {
		this.value1 = value1;
	}

	public String getValue2() {
		return value2;
	}

	public void setValue2(String value2) {
		this.value2 = value2;
	}

	public static class ADPredicate extends ADExpression implements Serializable {
		private static final long	serialVersionUID	= 1L;
		private BooleanOperator		booleanOperator;
		private List<ADExpression>	expressions			= new ArrayList<ADExpression>();

		public ADPredicate() {
		}

		public ADPredicate(BooleanOperator booleanOperator) {
			super();
			this.booleanOperator = booleanOperator;
		}

		@Override
		public boolean isParent() {
			return true;
		}

		@Override
		public String getColumnName() {
			return booleanOperator.name();
		}

		@Override
		public void setColumnName(String value) {
			booleanOperator = Enum.valueOf(BooleanOperator.class, value);
		}

		public BooleanOperator getBooleanOperator() {
			return booleanOperator;
		}

		public void setBooleanOperator(BooleanOperator booleanOperator) {
			this.booleanOperator = booleanOperator;
		}

		public List<ADExpression> getExpressions() {
			return expressions;
		}

		public void add(ADExpression expr) {
			expressions.add(expr);
		}

		public void setExpressions(List<ADExpression> expressions) {
			this.expressions = expressions;
		}

		public void remove(ADExpression childNode) {
			expressions.remove(childNode);
		}

	}

	public static enum BooleanOperator {
		And("&&"), Or("||");

		private String	symbol;

		BooleanOperator(String symbol) {
			this.symbol = symbol;
		}

		public String getSymbol() {
			return symbol;
		}

		public static LookupValue[] all() {
			LookupValue[] array = new LookupValue[BooleanOperator.values().length];
			int index = 0;
			for (BooleanOperator item : BooleanOperator.values()) {
				array[index] = new LookupValue(item.getSymbol(), item.name());
			}
			return array;
		}
	}

	public static enum FieldOperator {
		IsNull("is null"), IsNotNull("is not null"), Equal("="), NotEqual("!="), Gt(">"), Ge(">="), Lt("<"), Le("<="), Between("between"), NotBetween(
				"not between"), Like("like"), NotLike("not like"), In("in"), NotIn("not in");
		private String	symbol;

		FieldOperator(String symbol) {
			this.symbol = symbol;
		}

		public String getSymbol() {
			return symbol;
		}

		public static LookupValue[] all() {
			LookupValue[] array = new LookupValue[FieldOperator.values().length];
			int index = 0;
			for (FieldOperator item : FieldOperator.values()) {
				array[index] = new LookupValue(item.getSymbol(), item.name());
			}
			return array;
		}

		public static String[] allNames() {
			String[] array = new String[FieldOperator.values().length];
			int index = 0;
			for (FieldOperator item : FieldOperator.values()) {
				array[index] = item.name();
			}
			return array;
		}
	}

}
