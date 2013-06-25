package com.oz.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

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
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Detail {


    @XmlElement String delIndicator;
    @XmlElement String docPos;
    @XmlElement String numArt;
    @XmlElement String orderAmount;
    @XmlElement String price;

    public String getDelIndicator() {
        return delIndicator;
    }

    public void setDelIndicator(String delIndicator) {
        this.delIndicator = delIndicator;
    }

    public String getDocPos() {
        return docPos;
    }

    public void setDocPos(String docPos) {
        this.docPos = docPos;
    }

    public String getNumArt() {
        return numArt;
    }

    public void setNumArt(String numArt) {
        this.numArt = numArt;
    }

    public String getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(String orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Detail{" +
                "delIndicator='" + delIndicator + '\'' +
                ", docPos='" + docPos + '\'' +
                ", numArt='" + numArt + '\'' +
                ", orderAmount='" + orderAmount + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
