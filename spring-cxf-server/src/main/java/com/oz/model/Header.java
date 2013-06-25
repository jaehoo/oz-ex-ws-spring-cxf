package com.oz.model;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: asanchez
 * Date: 30/04/13
 * Time: 10:35 AM
 *
 * @author <a href="jaehoo@gmail.com">Alberto Sánchez</a>
 *         Contact me by:
 *         <ul><li>Twitter: @jaehoox</li><ul>
 */

//@XmlRootElement
//@XmlAccessorType(XmlAccessType.FIELD)
public class Header {

//    @XmlElement String numDoc;
//    @XmlElement String society;
//    @XmlElement String tipoCompra;
//    @XmlElement String docClass;
//    @XmlElement String delIndicator;
//    @XmlElement String providerAccount;
//    @XmlElement Date dateReg;

    String numDoc;
    String society;
    String tipoCompra;
    String docClass;
    String delIndicator;
    String providerAccount;
    Date dateReg;


    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }

    public String getSociety() {
        return society;
    }

    public void setSociety(String society) {
        this.society = society;
    }

    public String getTipoCompra() {
        return tipoCompra;
    }

    public void setTipoCompra(String tipoCompra) {
        this.tipoCompra = tipoCompra;
    }

    public String getDocClass() {
        return docClass;
    }

    public void setDocClass(String docClass) {
        this.docClass = docClass;
    }

    public String getDelIndicator() {
        return delIndicator;
    }

    public void setDelIndicator(String delIndicator) {
        this.delIndicator = delIndicator;
    }

    public String getProviderAccount() {
        return providerAccount;
    }

    public void setProviderAccount(String providerAccount) {
        this.providerAccount = providerAccount;
    }

    public Date getDateReg() {
        return dateReg;
    }

    public void setDateReg(Date dateReg) {
        this.dateReg = dateReg;
    }

    @Override
    public String toString() {
        return "Header{" +
                "numDoc='" + numDoc + '\'' +
                ", society='" + society + '\'' +
                ", tipoCompra='" + tipoCompra + '\'' +
                ", docClass='" + docClass + '\'' +
                ", delIndicator='" + delIndicator + '\'' +
                ", providerAccount='" + providerAccount + '\'' +
                ", dateReg=" + dateReg +
                '}';
    }
}
