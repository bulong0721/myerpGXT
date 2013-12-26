package org.adempiere.web.client.model;

public class ADResultPair<TOne extends IsADRPCModel, TTwo extends IsADRPCModel> implements IsADRPCModel {
	private TOne	one;
	private TTwo	two;

	public ADResultPair() {
	}

	public ADResultPair(TOne one, TTwo two) {
		super();
		this.one = one;
		this.two = two;
	}

	public TOne getOne() {
		return one;
	}

	public void setOne(TOne one) {
		this.one = one;
	}

	public TTwo getTwo() {
		return two;
	}

	public void setTwo(TTwo two) {
		this.two = two;
	}

}
