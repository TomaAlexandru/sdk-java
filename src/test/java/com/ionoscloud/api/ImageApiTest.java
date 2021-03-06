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
import com.ionoscloud.model.Image;
import com.ionoscloud.model.ImageProperties;
import com.ionoscloud.model.Images;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ImageApi
 */
@Ignore
public class ImageApiTest {

    private final ImageApi api = new ImageApi();

    
    /**
     * Delete an Image
     *
     * Deletes the specified image. This operation is permitted on private image only.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imagesDeleteTest() throws ApiException {
        String imageId = null;
        Boolean pretty = null;
        Integer depth = null;
        Integer xContractNumber = null;
        Object response = api.imagesDelete(imageId, pretty, depth, xContractNumber);

        // TODO: test validations
    }
    
    /**
     * Retrieve an Image
     *
     * Retrieves the attributes of a given image.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imagesFindByIdTest() throws ApiException {
        String imageId = null;
        Boolean pretty = null;
        Integer depth = null;
        Integer xContractNumber = null;
        Image response = api.imagesFindById(imageId, pretty, depth, xContractNumber);

        // TODO: test validations
    }
    
    /**
     * List Images 
     *
     * Retrieve a list of images within the datacenter
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imagesGetTest() throws ApiException {
        Boolean pretty = null;
        Integer depth = null;
        Integer xContractNumber = null;
        Images response = api.imagesGet(pretty, depth, xContractNumber);

        // TODO: test validations
    }
    
    /**
     * Partially modify an Image
     *
     * You can use update attributes of a resource
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imagesPatchTest() throws ApiException {
        String imageId = null;
        ImageProperties image = null;
        Boolean pretty = null;
        Integer depth = null;
        Integer xContractNumber = null;
        Image response = api.imagesPatch(imageId, image, pretty, depth, xContractNumber);

        // TODO: test validations
    }
    
    /**
     * Modify an Image
     *
     * You can use update attributes of a resource
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imagesPutTest() throws ApiException {
        String imageId = null;
        Image image = null;
        Boolean pretty = null;
        Integer depth = null;
        Integer xContractNumber = null;
        Image response = api.imagesPut(imageId, image, pretty, depth, xContractNumber);

        // TODO: test validations
    }
    
}
