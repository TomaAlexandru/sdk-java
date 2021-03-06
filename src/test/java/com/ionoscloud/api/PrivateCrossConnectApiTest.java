/*
 * CLOUD API
 * An enterprise-grade Infrastructure is provided as a Service (IaaS) solution that can be managed through a browser-based \"Data Center Designer\" (DCD) tool or via an easy to use API.   The API allows you to perform a variety of management tasks such as spinning up additional servers, adding volumes, adjusting networking, and so forth. It is designed to allow users to leverage the same power and flexibility found within the DCD visual tool. Both tools are consistent with their concepts and lend well to making the experience smooth and intuitive.
 *
 * The version of the OpenAPI document: 5.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ionoscloud.api;

import com.ionoscloud.ApiException;
import com.ionoscloud.model.Error;
import com.ionoscloud.model.PrivateCrossConnect;
import com.ionoscloud.model.PrivateCrossConnectProperties;
import com.ionoscloud.model.PrivateCrossConnects;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PrivateCrossConnectApi
 */
@Ignore
public class PrivateCrossConnectApiTest {

    private final PrivateCrossConnectApi api = new PrivateCrossConnectApi();

    
    /**
     * Delete a Private Cross-Connect
     *
     * Delete a private cross-connect if no datacenters are joined to the given PCC
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void pccsDeleteTest() throws ApiException {
        String pccId = null;
        Boolean pretty = null;
        Integer depth = null;
        Integer xContractNumber = null;
        Object response = api.pccsDelete(pccId, pretty, depth, xContractNumber);

        // TODO: test validations
    }
    
    /**
     * Retrieve a Private Cross-Connect
     *
     * You can retrieve a private cross-connect by using the resource&#39;s ID. This value can be found in the response body when a private cross-connect is created or when you GET a list of private cross-connects.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void pccsFindByIdTest() throws ApiException {
        String pccId = null;
        Boolean pretty = null;
        Integer depth = null;
        Integer xContractNumber = null;
        PrivateCrossConnect response = api.pccsFindById(pccId, pretty, depth, xContractNumber);

        // TODO: test validations
    }
    
    /**
     * List Private Cross-Connects 
     *
     * You can retrieve a complete list of private cross-connects provisioned under your account
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void pccsGetTest() throws ApiException {
        Boolean pretty = null;
        Integer depth = null;
        Integer xContractNumber = null;
        PrivateCrossConnects response = api.pccsGet(pretty, depth, xContractNumber);

        // TODO: test validations
    }
    
    /**
     * Partially modify a private cross-connect
     *
     * You can use update private cross-connect to re-name or update its description
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void pccsPatchTest() throws ApiException {
        String pccId = null;
        PrivateCrossConnectProperties pcc = null;
        Boolean pretty = null;
        Integer depth = null;
        Integer xContractNumber = null;
        PrivateCrossConnect response = api.pccsPatch(pccId, pcc, pretty, depth, xContractNumber);

        // TODO: test validations
    }
    
    /**
     * Create a Private Cross-Connect
     *
     * You can use this POST method to create a private cross-connect
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void pccsPostTest() throws ApiException {
        PrivateCrossConnect pcc = null;
        Boolean pretty = null;
        Integer depth = null;
        Integer xContractNumber = null;
        PrivateCrossConnect response = api.pccsPost(pcc, pretty, depth, xContractNumber);

        // TODO: test validations
    }
    
}
