package com.example.hnb;

public class Tecajnica {

	private long brojTecajnice;
	private String datumPrimjene;
	private String drzava;
	private String drzava_iso;
	private String sifra_valute;
	private String valuta;
	private long jedinica;
	private Double kupovni_tecaj;
	private Double srednji_tecaj;
	private Double prodajni_tecaj;
	
	public Tecajnica() {
		
	}

	public Tecajnica(long brojTecajnice, String datumPrimjene, String drzava, String drzava_iso, String sifra_valute,
			String valuta, long jedinica, Double kupovni_tecaj, Double srednji_tecaj, Double prodajni_tecaj) {
		super();
		this.brojTecajnice = brojTecajnice;
		this.datumPrimjene = datumPrimjene;
		this.drzava = drzava;
		this.drzava_iso = drzava_iso;
		this.sifra_valute = sifra_valute;
		this.valuta = valuta;
		this.jedinica = jedinica;
		this.kupovni_tecaj = kupovni_tecaj;
		this.srednji_tecaj = srednji_tecaj;
		this.prodajni_tecaj = prodajni_tecaj;
	}

	public long getBrojTecajnice() {
		return brojTecajnice;
	}

	public void setBrojTecajnice(long brojTecajnice) {
		this.brojTecajnice = brojTecajnice;
	}

	public String getDatumPrimjene() {
		return datumPrimjene;
	}

	public void setDatumPrimjene(String datumPrimjene) {
		this.datumPrimjene = datumPrimjene;
	}

	public String getDrzava() {
		return drzava;
	}

	public void setDrzava(String drzava) {
		this.drzava = drzava;
	}

	public String getDrzava_iso() {
		return drzava_iso;
	}

	public void setDrzava_iso(String drzava_iso) {
		this.drzava_iso = drzava_iso;
	}

	public String getSifra_valute() {
		return sifra_valute;
	}

	public void setSifra_valute(String sifra_valute) {
		this.sifra_valute = sifra_valute;
	}

	public String getValuta() {
		return valuta;
	}

	public void setValuta(String valuta) {
		this.valuta = valuta;
	}

	public long getJedinica() {
		return jedinica;
	}

	public void setJedinica(long jedinica) {
		this.jedinica = jedinica;
	}

	public Double getKupovni_tecaj() {
		return kupovni_tecaj;
	}

	public void setKupovni_tecaj(Double kupovni_tecaj) {
		this.kupovni_tecaj = kupovni_tecaj;
	}

	public Double getSrednji_tecaj() {
		return srednji_tecaj;
	}

	public void setSrednji_tecaj(Double srednji_tecaj) {
		this.srednji_tecaj = srednji_tecaj;
	}

	public Double getProdajni_tecaj() {
		return prodajni_tecaj;
	}

	public void setProdajni_tecaj(Double prodajni_tecaj) {
		this.prodajni_tecaj = prodajni_tecaj;
	}

	@Override
	public String toString() {
		return "Tecajnica [brojTecajnice=" + brojTecajnice + ", datumPrimjene=" + datumPrimjene + ", drzava=" + drzava
				+ ", drzava_iso=" + drzava_iso + ", sifra_valute=" + sifra_valute + ", valuta=" + valuta + ", jedinica="
				+ jedinica + ", kupovni_tecaj=" + kupovni_tecaj + ", srednji_tecaj=" + srednji_tecaj
				+ ", prodajni_tecaj=" + prodajni_tecaj + "]";
	}
	
}
