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

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.FederalTaxDetails;
import com.konfigthis.client.model.FederalTaxDetailsUpdateAttributesRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FederalTaxDetailsApi
 */
@Disabled
public class FederalTaxDetailsApiTest {

    private static FederalTaxDetailsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new FederalTaxDetailsApi(apiClient);
    }

    /**
     * Get Federal Tax Details
     *
     * Fetches attributes relevant for a company&#39;s federal taxes.  scope: &#x60;company_federal_taxes:read&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAttributesTest() throws ApiException {
        String companyId = null;
        String xGustoAPIVersion = null;
        FederalTaxDetails response = api.getAttributes(companyId)
                .xGustoAPIVersion(xGustoAPIVersion)
                .execute();
        // TODO: test validations
    }

    /**
     * Update Federal Tax Details
     *
     * Updates attributes relevant for a company&#39;s federal taxes. This information is required is to onboard a company for use with Gusto Embedded Payroll.  scope: &#x60;company_federal_taxes:write&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateAttributesTest() throws ApiException {
        String version = null;
        String companyId = null;
        String legalName = null;
        String ein = null;
        String taxPayerType = null;
        String filingForm = null;
        Boolean taxableAsScorp = null;
        String xGustoAPIVersion = null;
        FederalTaxDetails response = api.updateAttributes(version, companyId)
                .legalName(legalName)
                .ein(ein)
                .taxPayerType(taxPayerType)
                .filingForm(filingForm)
                .taxableAsScorp(taxableAsScorp)
                .xGustoAPIVersion(xGustoAPIVersion)
                .execute();
        // TODO: test validations
    }

}
