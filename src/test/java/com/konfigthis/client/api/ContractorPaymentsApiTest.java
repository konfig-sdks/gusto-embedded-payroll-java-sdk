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
import com.konfigthis.client.model.ContractorPayment;
import com.konfigthis.client.model.ContractorPaymentReceipt;
import com.konfigthis.client.model.ContractorPaymentsCreatePaymentRequest;
import com.konfigthis.client.model.ContractorPaymentsPreviewDebitDateRequest;
import com.konfigthis.client.model.ContractorPaymentsPreviewDebitDateRequestContractorPaymentsInner;
import com.konfigthis.client.model.ContractorPaymentsPreviewDebitDateResponse;
import java.time.LocalDate;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ContractorPaymentsApi
 */
@Disabled
public class ContractorPaymentsApiTest {

    private static ContractorPaymentsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ContractorPaymentsApi(apiClient);
    }

    /**
     * Cancel a contractor payment
     *
     * Cancels and deletes a contractor payment. If the contractor payment has already started processing, the payment cannot be cancelled.  scope: &#x60;payrolls:run&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void cancelPaymentTest() throws ApiException {
        String companyId = null;
        String contractorPaymentId = null;
        String xGustoAPIVersion = null;
        api.cancelPayment(companyId, contractorPaymentId)
                .xGustoAPIVersion(xGustoAPIVersion)
                .execute();
        // TODO: test validations
    }

    /**
     * Create a contractor payment
     *
     * Pay a contractor. Information needed depends on the contractor&#39;s wage type (hourly vs fixed)  scope: &#x60;payrolls:run&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createPaymentTest() throws ApiException {
        String contractorUuid = null;
        LocalDate date = null;
        String companyId = null;
        String paymentMethod = null;
        Double wage = null;
        Double hours = null;
        Double bonus = null;
        Double reimbursement = null;
        String xGustoAPIVersion = null;
        ContractorPayment response = api.createPayment(contractorUuid, date, companyId)
                .paymentMethod(paymentMethod)
                .wage(wage)
                .hours(hours)
                .bonus(bonus)
                .reimbursement(reimbursement)
                .xGustoAPIVersion(xGustoAPIVersion)
                .execute();
        // TODO: test validations
    }

    /**
     * Fund a contractor payment [DEMO]
     *
     * &gt; 🚧 Demo action &gt; &gt; This action is only available in the Demo environment  Simulate funding a contractor payment. Funding only occurs automatically in the production environment when bank transactions are generated. Use this action in the demo environment to transition a contractor payment&#39;s &#x60;status&#x60; from &#x60;Unfunded&#x60; to &#x60;Funded&#x60;. A &#x60;Funded&#x60; status is required for generating a contractor payment receipt.  scope: &#x60;payrolls:run&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fundContractorPaymentTest() throws ApiException {
        String contractorPaymentUuid = null;
        String xGustoAPIVersion = null;
        ContractorPayment response = api.fundContractorPayment(contractorPaymentUuid)
                .xGustoAPIVersion(xGustoAPIVersion)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a single contractor payment
     *
     * Returns a single contractor payments  scope: &#x60;payrolls:read&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSinglePaymentTest() throws ApiException {
        String companyId = null;
        String contractorPaymentId = null;
        String xGustoAPIVersion = null;
        ContractorPayment response = api.getSinglePayment(companyId, contractorPaymentId)
                .xGustoAPIVersion(xGustoAPIVersion)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a single contractor payment receipt
     *
     * Returns a contractor payment receipt.  Notes: * Receipts are only available for direct deposit payments and are only available once those payments have been funded. * Payroll Receipt requests for payrolls which do not have receipts available (e.g. payment by check) will return a 404 status. * Hour and dollar amounts are returned as string representations of numeric decimals. * Dollar amounts are represented to the cent. * If no data has yet be inserted for a given field, it defaults to “0.00” (for fixed amounts).  scope: &#x60;payrolls:read&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSingleReceiptTest() throws ApiException {
        String contractorPaymentUuid = null;
        String xGustoAPIVersion = null;
        ContractorPaymentReceipt response = api.getSingleReceipt(contractorPaymentUuid)
                .xGustoAPIVersion(xGustoAPIVersion)
                .execute();
        // TODO: test validations
    }

    /**
     * Get contractor payments for a company
     *
     * Returns an object containing individual contractor payments, within a given time period, including totals.  scope: &#x60;payrolls:read&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getWithinTimePeriodTotalsTest() throws ApiException {
        String companyId = null;
        String startDate = null;
        String endDate = null;
        String contractorUuid = null;
        Boolean groupByDate = null;
        Double page = null;
        Double per = null;
        String xGustoAPIVersion = null;
        Object response = api.getWithinTimePeriodTotals(companyId, startDate, endDate)
                .contractorUuid(contractorUuid)
                .groupByDate(groupByDate)
                .page(page)
                .per(per)
                .xGustoAPIVersion(xGustoAPIVersion)
                .execute();
        // TODO: test validations
    }

    /**
     * Preview contractor payment debit date
     *
     * Returns a debit_date dependent on the ACH payment speed of the company.  If the payment method is Check or Historical payment, the debit_date will be the same as the check_date.  scope: &#x60;payrolls:read&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void previewDebitDateTest() throws ApiException {
        String companyUuid = null;
        List<ContractorPaymentsPreviewDebitDateRequestContractorPaymentsInner> contractorPayments = null;
        String xGustoAPIVersion = null;
        ContractorPaymentsPreviewDebitDateResponse response = api.previewDebitDate(companyUuid)
                .contractorPayments(contractorPayments)
                .xGustoAPIVersion(xGustoAPIVersion)
                .execute();
        // TODO: test validations
    }

}
