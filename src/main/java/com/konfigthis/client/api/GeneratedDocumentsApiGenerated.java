/*
 * Gusto API
 * Welcome to Gusto's Embedded Payroll API documentation!
 *
 * The version of the OpenAPI document: 2024-03-01
 * Contact: developer@gusto.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.GeneratedDocument;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class GeneratedDocumentsApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public GeneratedDocumentsApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public GeneratedDocumentsApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call getDocumentByRequestUuidCall(String documentType, String requestUuid, String xGustoAPIVersion, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/generated_documents/{document_type}/{request_uuid}"
            .replace("{" + "document_type" + "}", localVarApiClient.escapeString(documentType.toString()))
            .replace("{" + "request_uuid" + "}", localVarApiClient.escapeString(requestUuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (xGustoAPIVersion != null) {
            localVarHeaderParams.put("X-Gusto-API-Version", localVarApiClient.parameterToString(xGustoAPIVersion));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "Authorization" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getDocumentByRequestUuidValidateBeforeCall(String documentType, String requestUuid, String xGustoAPIVersion, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'documentType' is set
        if (documentType == null) {
            throw new ApiException("Missing the required parameter 'documentType' when calling getDocumentByRequestUuid(Async)");
        }

        // verify the required parameter 'requestUuid' is set
        if (requestUuid == null) {
            throw new ApiException("Missing the required parameter 'requestUuid' when calling getDocumentByRequestUuid(Async)");
        }

        return getDocumentByRequestUuidCall(documentType, requestUuid, xGustoAPIVersion, _callback);

    }


    private ApiResponse<GeneratedDocument> getDocumentByRequestUuidWithHttpInfo(String documentType, String requestUuid, String xGustoAPIVersion) throws ApiException {
        okhttp3.Call localVarCall = getDocumentByRequestUuidValidateBeforeCall(documentType, requestUuid, xGustoAPIVersion, null);
        Type localVarReturnType = new TypeToken<GeneratedDocument>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getDocumentByRequestUuidAsync(String documentType, String requestUuid, String xGustoAPIVersion, final ApiCallback<GeneratedDocument> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDocumentByRequestUuidValidateBeforeCall(documentType, requestUuid, xGustoAPIVersion, _callback);
        Type localVarReturnType = new TypeToken<GeneratedDocument>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetDocumentByRequestUuidRequestBuilder {
        private final String documentType;
        private final String requestUuid;
        private String xGustoAPIVersion;

        private GetDocumentByRequestUuidRequestBuilder(String documentType, String requestUuid) {
            this.documentType = documentType;
            this.requestUuid = requestUuid;
        }

        /**
         * Set xGustoAPIVersion
         * @param xGustoAPIVersion Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. (optional)
         * @return GetDocumentByRequestUuidRequestBuilder
         */
        public GetDocumentByRequestUuidRequestBuilder xGustoAPIVersion(String xGustoAPIVersion) {
            this.xGustoAPIVersion = xGustoAPIVersion;
            return this;
        }
        
        /**
         * Build call for getDocumentByRequestUuid
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getDocumentByRequestUuidCall(documentType, requestUuid, xGustoAPIVersion, _callback);
        }


        /**
         * Execute getDocumentByRequestUuid request
         * @return GeneratedDocument
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  </td><td>  -  </td></tr>
         </table>
         */
        public GeneratedDocument execute() throws ApiException {
            ApiResponse<GeneratedDocument> localVarResp = getDocumentByRequestUuidWithHttpInfo(documentType, requestUuid, xGustoAPIVersion);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getDocumentByRequestUuid request with HTTP info returned
         * @return ApiResponse&lt;GeneratedDocument&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<GeneratedDocument> executeWithHttpInfo() throws ApiException {
            return getDocumentByRequestUuidWithHttpInfo(documentType, requestUuid, xGustoAPIVersion);
        }

        /**
         * Execute getDocumentByRequestUuid request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<GeneratedDocument> _callback) throws ApiException {
            return getDocumentByRequestUuidAsync(documentType, requestUuid, xGustoAPIVersion, _callback);
        }
    }

    /**
     * Get a generated document
     * Get a generated document given the request_uuid. The response will include the generation request&#39;s status and, if complete, the relevant document urls.  scope: &#x60;generated_documents:read&#x60;
     * @param documentType the type of document being generated (required)
     * @param requestUuid The UUID of the Generated Document Request (required)
     * @return GetDocumentByRequestUuidRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Example response </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  </td><td>  -  </td></tr>
     </table>
     */
    public GetDocumentByRequestUuidRequestBuilder getDocumentByRequestUuid(String documentType, String requestUuid) throws IllegalArgumentException {
        if (documentType == null) throw new IllegalArgumentException("\"documentType\" is required but got null");
            

        if (requestUuid == null) throw new IllegalArgumentException("\"requestUuid\" is required but got null");
            

        return new GetDocumentByRequestUuidRequestBuilder(documentType, requestUuid);
    }
}
