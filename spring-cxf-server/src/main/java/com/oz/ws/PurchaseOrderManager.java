package com.oz.ws;

import com.oz.model.Detail;
import com.oz.model.Header;
import org.apache.log4j.Logger;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: asanchez
 * Date: 2/05/13
 * Time: 10:22 AM
 *
 * @author <a href="jaehoo@gmail.com">Alberto Sánchez</a>
 *         Contact me by:
 *         <ul><li>Twitter: @jaehoox</li><ul>
 */
@WebService
public class PurchaseOrderManager {

    private Random r= new Random();
    private static final Logger logger = Logger.getLogger(PurchaseOrderManager.class);

    @WebMethod(operationName = "getUpdatePurchaseOrder" )
    @WebResult
    public Integer updatePurchaseOrder(
            @WebParam(name = "cabecero" ) Header header
            , @WebParam(name = "detalle") Detail detail){

        logger.info("header:\n" + header);
        logger.info("detail:\n" + detail);

        int value=r.nextInt(31) + 5;
        logger.info(value);

        return value;
    }

}
