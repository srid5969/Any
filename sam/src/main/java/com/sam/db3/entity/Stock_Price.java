package com.sam.db3.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stock_price")

public class Stock_Price {
	@Id
	private Integer sid;
	private String sinstrument;
	private String ssymbol;
	private String sexpiry_dt;
	private Integer tdopen;
	private Integer tdhigh;
	private Integer tdlow;
	private Integer tdclose;
	private String tdtimestamp;
	private Integer twopen;
	private Integer twhigh;
	private Integer twlow;
	private Integer twclose;
	private String twtimestamp;
	private Integer tmopen;
	private Integer tmhigh;
	private Integer tmlow;
	private Integer tmclose;
	private String tmtimestamp;
	private Integer tyopen;
	private Integer tyhigh;
	private Integer tylow;
	private Integer tyclose;
	private String tytimestamp;
	private Integer dopen;
	private Integer dhigh;
	private Integer dlow;
	private Integer dclose;
	private String dtimestamp;
	private Integer wopen;
	private Integer whigh;
	private Integer wlow;
	private Integer wclose;
	private String wtimestamp;
	private Integer mopen;
	private Integer mhigh;
	private Integer mlow;
	private Integer mclose;
	private String mtimestamp;
	private Integer yopen;
	private Integer yhigh;
	private Integer ylow;
	private Integer yclose;
	private String ytimestamp;
	private String slastupdatedate;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSinstrument() {
		return sinstrument;
	}
	public void setSinstrument(String sinstrument) {
		this.sinstrument = sinstrument;
	}
	public String getSsymbol() {
		return ssymbol;
	}
	public void setSsymbol(String ssymbol) {
		this.ssymbol = ssymbol;
	}
	public String getSexpiry_dt() {
		return sexpiry_dt;
	}
	public void setSexpiry_dt(String sexpiry_dt) {
		this.sexpiry_dt = sexpiry_dt;
	}
	public Integer getTdopen() {
		return tdopen;
	}
	public void setTdopen(Integer tdopen) {
		this.tdopen = tdopen;
	}
	public Integer getTdhigh() {
		return tdhigh;
	}
	public void setTdhigh(Integer tdhigh) {
		this.tdhigh = tdhigh;
	}
	public Integer getTdlow() {
		return tdlow;
	}
	public void setTdlow(Integer tdlow) {
		this.tdlow = tdlow;
	}
	public Integer getTdclose() {
		return tdclose;
	}
	public void setTdclose(Integer tdclose) {
		this.tdclose = tdclose;
	}
	public String getTdtimestamp() {
		return tdtimestamp;
	}
	public void setTdtimestamp(String tdtimestamp) {
		this.tdtimestamp = tdtimestamp;
	}
	public Integer getTwopen() {
		return twopen;
	}
	public void setTwopen(Integer twopen) {
		this.twopen = twopen;
	}
	public Integer getTwhigh() {
		return twhigh;
	}
	public void setTwhigh(Integer twhigh) {
		this.twhigh = twhigh;
	}
	public Integer getTwlow() {
		return twlow;
	}
	public void setTwlow(Integer twlow) {
		this.twlow = twlow;
	}
	public Integer getTwclose() {
		return twclose;
	}
	public void setTwclose(Integer twclose) {
		this.twclose = twclose;
	}
	public String getTwtimestamp() {
		return twtimestamp;
	}
	public void setTwtimestamp(String twtimestamp) {
		this.twtimestamp = twtimestamp;
	}
	public Integer getTmopen() {
		return tmopen;
	}
	public void setTmopen(Integer tmopen) {
		this.tmopen = tmopen;
	}
	public Integer getTmhigh() {
		return tmhigh;
	}
	public void setTmhigh(Integer tmhigh) {
		this.tmhigh = tmhigh;
	}
	public Integer getTmlow() {
		return tmlow;
	}
	public void setTmlow(Integer tmlow) {
		this.tmlow = tmlow;
	}
	public Integer getTmclose() {
		return tmclose;
	}
	public void setTmclose(Integer tmclose) {
		this.tmclose = tmclose;
	}
	public String getTmtimestamp() {
		return tmtimestamp;
	}
	public void setTmtimestamp(String tmtimestamp) {
		this.tmtimestamp = tmtimestamp;
	}
	public Integer getTyopen() {
		return tyopen;
	}
	public void setTyopen(Integer tyopen) {
		this.tyopen = tyopen;
	}
	public Integer getTyhigh() {
		return tyhigh;
	}
	public void setTyhigh(Integer tyhigh) {
		this.tyhigh = tyhigh;
	}
	public Integer getTylow() {
		return tylow;
	}
	public void setTylow(Integer tylow) {
		this.tylow = tylow;
	}
	public Integer getTyclose() {
		return tyclose;
	}
	public void setTyclose(Integer tyclose) {
		this.tyclose = tyclose;
	}
	public String getTytimestamp() {
		return tytimestamp;
	}
	public void setTytimestamp(String tytimestamp) {
		this.tytimestamp = tytimestamp;
	}
	public Integer getDopen() {
		return dopen;
	}
	public void setDopen(Integer dopen) {
		this.dopen = dopen;
	}
	public Integer getDhigh() {
		return dhigh;
	}
	public void setDhigh(Integer dhigh) {
		this.dhigh = dhigh;
	}
	public Integer getDlow() {
		return dlow;
	}
	public void setDlow(Integer dlow) {
		this.dlow = dlow;
	}
	public Integer getDclose() {
		return dclose;
	}
	public void setDclose(Integer dclose) {
		this.dclose = dclose;
	}
	public String getDtimestamp() {
		return dtimestamp;
	}
	public void setDtimestamp(String dtimestamp) {
		this.dtimestamp = dtimestamp;
	}
	public Integer getWopen() {
		return wopen;
	}
	public void setWopen(Integer wopen) {
		this.wopen = wopen;
	}
	public Integer getWhigh() {
		return whigh;
	}
	public void setWhigh(Integer whigh) {
		this.whigh = whigh;
	}
	public Integer getWlow() {
		return wlow;
	}
	public void setWlow(Integer wlow) {
		this.wlow = wlow;
	}
	public Integer getWclose() {
		return wclose;
	}
	public void setWclose(Integer wclose) {
		this.wclose = wclose;
	}
	public String getWtimestamp() {
		return wtimestamp;
	}
	public void setWtimestamp(String wtimestamp) {
		this.wtimestamp = wtimestamp;
	}
	public Integer getMopen() {
		return mopen;
	}
	public void setMopen(Integer mopen) {
		this.mopen = mopen;
	}
	public Integer getMhigh() {
		return mhigh;
	}
	public void setMhigh(Integer mhigh) {
		this.mhigh = mhigh;
	}
	public Integer getMlow() {
		return mlow;
	}
	public void setMlow(Integer mlow) {
		this.mlow = mlow;
	}
	public Integer getMclose() {
		return mclose;
	}
	public void setMclose(Integer mclose) {
		this.mclose = mclose;
	}
	public String getMtimestamp() {
		return mtimestamp;
	}
	public void setMtimestamp(String mtimestamp) {
		this.mtimestamp = mtimestamp;
	}
	public Integer getYopen() {
		return yopen;
	}
	public void setYopen(Integer yopen) {
		this.yopen = yopen;
	}
	public Integer getYhigh() {
		return yhigh;
	}
	public void setYhigh(Integer yhigh) {
		this.yhigh = yhigh;
	}
	public Integer getYlow() {
		return ylow;
	}
	public void setYlow(Integer ylow) {
		this.ylow = ylow;
	}
	public Integer getYclose() {
		return yclose;
	}
	public void setYclose(Integer yclose) {
		this.yclose = yclose;
	}
	public String getYtimestamp() {
		return ytimestamp;
	}
	public void setYtimestamp(String ytimestamp) {
		this.ytimestamp = ytimestamp;
	}
	public String getSlastupdatedate() {
		return slastupdatedate;
	}
	public void setSlastupdatedate(String slastupdatedate) {
		this.slastupdatedate = slastupdatedate;
	}
	public Stock_Price(Integer sid, String sinstrument, String ssymbol, String sexpiry_dt, Integer tdopen, Integer tdhigh,
			Integer tdlow, Integer tdclose, String tdtimestamp, Integer twopen, Integer twhigh, Integer twlow, Integer twclose,
			String twtimestamp, Integer tmopen, Integer tmhigh, Integer tmlow, Integer tmclose, String tmtimestamp, Integer tyopen,
			Integer tyhigh, Integer tylow, Integer tyclose, String tytimestamp, Integer dopen, Integer dhigh, Integer dlow, Integer dclose,
			String dtimestamp, Integer wopen, Integer whigh, Integer wlow, Integer wclose, String wtimestamp, Integer mopen, Integer mhigh,
			Integer mlow, Integer mclose, String mtimestamp, Integer yopen, Integer yhigh, Integer ylow, Integer yclose, String ytimestamp,
			String slastupdatedate) {
		super();
		this.sid = sid;
		this.sinstrument = sinstrument;
		this.ssymbol = ssymbol;
		this.sexpiry_dt = sexpiry_dt;
		this.tdopen = tdopen;
		this.tdhigh = tdhigh;
		this.tdlow = tdlow;
		this.tdclose = tdclose;
		this.tdtimestamp = tdtimestamp;
		this.twopen = twopen;
		this.twhigh = twhigh;
		this.twlow = twlow;
		this.twclose = twclose;
		this.twtimestamp = twtimestamp;
		this.tmopen = tmopen;
		this.tmhigh = tmhigh;
		this.tmlow = tmlow;
		this.tmclose = tmclose;
		this.tmtimestamp = tmtimestamp;
		this.tyopen = tyopen;
		this.tyhigh = tyhigh;
		this.tylow = tylow;
		this.tyclose = tyclose;
		this.tytimestamp = tytimestamp;
		this.dopen = dopen;
		this.dhigh = dhigh;
		this.dlow = dlow;
		this.dclose = dclose;
		this.dtimestamp = dtimestamp;
		this.wopen = wopen;
		this.whigh = whigh;
		this.wlow = wlow;
		this.wclose = wclose;
		this.wtimestamp = wtimestamp;
		this.mopen = mopen;
		this.mhigh = mhigh;
		this.mlow = mlow;
		this.mclose = mclose;
		this.mtimestamp = mtimestamp;
		this.yopen = yopen;
		this.yhigh = yhigh;
		this.ylow = ylow;
		this.yclose = yclose;
		this.ytimestamp = ytimestamp;
		this.slastupdatedate = slastupdatedate;
	}
	public Stock_Price() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
