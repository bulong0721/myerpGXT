package org.adempiere.model.common;

import java.io.Serializable;
import java.util.List;

public class Expression implements Serializable {
	private static final long	serialVersionUID	= 1L;
	private String				columnName;
	private FieldOperator		fieldOperator;
	private Serializable		value1;
	private Serializable		value2;

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

	public Serializable getValue1() {
		return value1;
	}

	public void setValue1(Serializable value1) {
		this.value1 = value1;
	}

	public Serializable getValue2() {
		return value2;
	}

	public void setValue2(Serializable value2) {
		this.value2 = value2;
	}

	public static class Predicate extends Expression implements Serializable {
		private static final long	serialVersionUID	= 1L;
		private BooleanOperator		booleanOperator;
		private List<Expression>	expressions;

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

		public List<Expression> getExpressions() {
			return expressions;
		}

		public void setExpressions(List<Expression> expressions) {
			this.expressions = expressions;
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
