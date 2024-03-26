# ContractorsApi

All URIs are relative to *https://api.gusto-demo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**changeOnboardingStatus**](ContractorsApi.md#changeOnboardingStatus) | **PUT** /v1/contractors/{contractor_uuid}/onboarding_status | Change the contractor&#39;s onboarding status |
| [**createNewContractor**](ContractorsApi.md#createNewContractor) | **POST** /v1/companies/{company_id}/contractors | Create a contractor |
| [**deleteContractor**](ContractorsApi.md#deleteContractor) | **DELETE** /v1/contractors/{contractor_id} | Delete a contractor |
| [**getAddress**](ContractorsApi.md#getAddress) | **GET** /v1/contractors/{contractor_uuid}/address | Get a contractor address |
| [**getById**](ContractorsApi.md#getById) | **GET** /v1/contractors/{contractor_id} | Get a contractor |
| [**getCompanyContractors**](ContractorsApi.md#getCompanyContractors) | **GET** /v1/companies/{company_id}/contractors | Get contractors of a company |
| [**getOnboardingStatus**](ContractorsApi.md#getOnboardingStatus) | **GET** /v1/contractors/{contractor_uuid}/onboarding_status | Get the contractor&#39;s onboarding status |
| [**updateAddress**](ContractorsApi.md#updateAddress) | **PUT** /v1/contractors/{contractor_uuid}/address | Update a contractor&#39;s address |
| [**updateContractor**](ContractorsApi.md#updateContractor) | **PUT** /v1/contractors/{contractor_id} | Update a contractor |


<a name="changeOnboardingStatus"></a>
# **changeOnboardingStatus**
> ContractorOnboardingStatus changeOnboardingStatus(contractorUuid).xGustoAPIVersion(xGustoAPIVersion).contractorsChangeOnboardingStatusRequest(contractorsChangeOnboardingStatusRequest).execute();

Change the contractor&#39;s onboarding status

Updates a contractor&#39;s onboarding status.  scope: &#x60;contractors:write&#x60;  Below is a list of valid onboarding status changes depending on the intended action to be performed on behalf of the contractor.  | Action | current onboarding_status | new onboarding_status | |:------------------|:------------:|----------:| | Mark a contractor as self-onboarding | &#x60;admin_onboarding_incomplete&#x60; | &#x60;self_onboarding_not_invited&#x60; | | Invite an employee to self-onboard | &#x60;admin_onboarding_incomplete&#x60; or &#x60;self_onboarding_not_invited&#x60; | &#x60;self_onboarding_invited&#x60; | | Cancel an employee&#39;s self-onboarding | &#x60;self_onboarding_invited&#x60; or &#x60;self_onboarding_not_invited&#x60; | &#x60;admin_onboarding_incomplete&#x60; | | Review an employee&#39;s self-onboarded info | &#x60;self_onboarding_started&#x60; | &#x60;self_onboarding_review&#x60; | | Finish an employee&#39;s onboarding | &#x60;admin_onboarding_incomplete&#x60; or &#x60;self_onboarding_review&#x60; | &#x60;onboarding_completed&#x60; |

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContractorsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.gusto-demo.com";
    
    // Configure HTTP bearer authorization: Authorization
    configuration.token = "BEARER TOKEN";
    GustoEmbeddedPayroll client = new GustoEmbeddedPayroll(configuration);
    String onboardingStatus = "onboarding_completed"; // The updated onboarding status for the employee
    String contractorUuid = "contractorUuid_example"; // The UUID of the contractor
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      ContractorOnboardingStatus result = client
              .contractors
              .changeOnboardingStatus(onboardingStatus, contractorUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getUuid());
      System.out.println(result.getOnboardingStatus());
      System.out.println(result.getOnboardingSteps());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorsApi#changeOnboardingStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ContractorOnboardingStatus> response = client
              .contractors
              .changeOnboardingStatus(onboardingStatus, contractorUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorsApi#changeOnboardingStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **contractorUuid** | **String**| The UUID of the contractor | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |
| **contractorsChangeOnboardingStatusRequest** | [**ContractorsChangeOnboardingStatusRequest**](ContractorsChangeOnboardingStatusRequest.md)|  | [optional] |

### Return type

[**ContractorOnboardingStatus**](ContractorOnboardingStatus.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Example response. |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

<a name="createNewContractor"></a>
# **createNewContractor**
> Contractor createNewContractor(companyId).xGustoAPIVersion(xGustoAPIVersion).contractorsCreateNewContractorRequest(contractorsCreateNewContractorRequest).execute();

Create a contractor

Create an individual or business contractor.  scope: &#x60;contractors:manage&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContractorsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.gusto-demo.com";
    
    // Configure HTTP bearer authorization: Authorization
    configuration.token = "BEARER TOKEN";
    GustoEmbeddedPayroll client = new GustoEmbeddedPayroll(configuration);
    String companyId = "companyId_example"; // The UUID of the company
    String type = "Individual"; // The contractor type.
    String wageType = "Fixed"; // The contractor’s wage type. 
    String startDate = "startDate_example"; // The day when the contractor will start working for the company. 
    String hourlyRate = "hourlyRate_example"; // The contractor’s hourly rate. This attribute is required if the wage_type is `Hourly`.
    Boolean selfOnboarding = false; // Whether the contractor or the payroll admin will complete onboarding in Gusto. Self-onboarding is recommended so that contractors receive Gusto accounts. If self_onboarding is true, then email is required.
    String email = "email_example"; // The contractor’s email address.
    String firstName = "firstName_example"; // The contractor’s first name. This attribute is required for `Individual` contractors and will be ignored for `Business` contractors.
    String lastName = "lastName_example"; // The contractor’s last name. This attribute is required for `Individual` contractors and will be ignored for `Business` contractors.
    String middleInitial = "middleInitial_example"; // The contractor’s middle initial. This attribute is optional for `Individual` contractors and will be ignored for `Business` contractors.
    Boolean fileNewHireReport = false; // The boolean flag indicating whether Gusto will file a new hire report for the contractor. This attribute is optional for `Individual` contractors and will be ignored for `Business` contractors.
    String workState = "workState_example"; // State where the contractor will be conducting the majority of their work for the company. This value is used when generating the new hire report. This attribute is required for `Individual` contractors if `file_new_hire_report` is true and will be ignored for `Business` contractors.
    String ssn = "ssn_example"; // This attribute is optional for `Individual` contractors and will be ignored for `Business` contractors. Social security number is needed to file the annual 1099 tax form.
    String businessName = "businessName_example"; // The name of the contractor business. This attribute is required for `Business` contractors and will be ignored for `Individual` contractors.
    String ein = "ein_example"; // The employer identification number of the contractor business. This attribute is optional for `Business` contractors and will be ignored for `Individual` contractors.
    Boolean isActive = true; // The status of the contractor.
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      Contractor result = client
              .contractors
              .createNewContractor(companyId)
              .type(type)
              .wageType(wageType)
              .startDate(startDate)
              .hourlyRate(hourlyRate)
              .selfOnboarding(selfOnboarding)
              .email(email)
              .firstName(firstName)
              .lastName(lastName)
              .middleInitial(middleInitial)
              .fileNewHireReport(fileNewHireReport)
              .workState(workState)
              .ssn(ssn)
              .businessName(businessName)
              .ein(ein)
              .isActive(isActive)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getUuid());
      System.out.println(result.getCompanyUuid());
      System.out.println(result.getWageType());
      System.out.println(result.getIsActive());
      System.out.println(result.getType());
      System.out.println(result.getFirstName());
      System.out.println(result.getLastName());
      System.out.println(result.getMiddleInitial());
      System.out.println(result.getBusinessName());
      System.out.println(result.getEin());
      System.out.println(result.getHasEin());
      System.out.println(result.getEmail());
      System.out.println(result.getStartDate());
      System.out.println(result.getAddress());
      System.out.println(result.getHourlyRate());
      System.out.println(result.getFileNewHireReport());
      System.out.println(result.getWorkState());
      System.out.println(result.getOnboarded());
      System.out.println(result.getOnboardingStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorsApi#createNewContractor");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Contractor> response = client
              .contractors
              .createNewContractor(companyId)
              .type(type)
              .wageType(wageType)
              .startDate(startDate)
              .hourlyRate(hourlyRate)
              .selfOnboarding(selfOnboarding)
              .email(email)
              .firstName(firstName)
              .lastName(lastName)
              .middleInitial(middleInitial)
              .fileNewHireReport(fileNewHireReport)
              .workState(workState)
              .ssn(ssn)
              .businessName(businessName)
              .ein(ein)
              .isActive(isActive)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorsApi#createNewContractor");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **companyId** | **String**| The UUID of the company | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |
| **contractorsCreateNewContractorRequest** | [**ContractorsCreateNewContractorRequest**](ContractorsCreateNewContractorRequest.md)| Create an individual or business contractor. | [optional] |

### Return type

[**Contractor**](Contractor.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Example response |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

<a name="deleteContractor"></a>
# **deleteContractor**
> deleteContractor(contractorId).xGustoAPIVersion(xGustoAPIVersion).execute();

Delete a contractor

A contractor can only be deleted when there are no contractor payments.  scope: &#x60;contractors:manage&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContractorsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.gusto-demo.com";
    
    // Configure HTTP bearer authorization: Authorization
    configuration.token = "BEARER TOKEN";
    GustoEmbeddedPayroll client = new GustoEmbeddedPayroll(configuration);
    String contractorId = "contractorId_example"; // The UUID of the contractor
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      client
              .contractors
              .deleteContractor(contractorId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorsApi#deleteContractor");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .contractors
              .deleteContractor(contractorId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorsApi#deleteContractor");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **contractorId** | **String**| The UUID of the contractor | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

<a name="getAddress"></a>
# **getAddress**
> ContractorAddress getAddress(contractorUuid).xGustoAPIVersion(xGustoAPIVersion).execute();

Get a contractor address

The address of a contractor is used to determine certain tax information about them. Addresses are geocoded on create and update to ensure validity.  scope: &#x60;contractors:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContractorsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.gusto-demo.com";
    
    // Configure HTTP bearer authorization: Authorization
    configuration.token = "BEARER TOKEN";
    GustoEmbeddedPayroll client = new GustoEmbeddedPayroll(configuration);
    String contractorUuid = "contractorUuid_example"; // The UUID of the contractor
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      ContractorAddress result = client
              .contractors
              .getAddress(contractorUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getStreet1());
      System.out.println(result.getStreet2());
      System.out.println(result.getCity());
      System.out.println(result.getState());
      System.out.println(result.getZip());
      System.out.println(result.getCountry());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorsApi#getAddress");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ContractorAddress> response = client
              .contractors
              .getAddress(contractorUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorsApi#getAddress");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **contractorUuid** | **String**| The UUID of the contractor | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**ContractorAddress**](ContractorAddress.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Example response |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

<a name="getById"></a>
# **getById**
> Contractor getById(contractorId).xGustoAPIVersion(xGustoAPIVersion).execute();

Get a contractor

Get a contractor.  scope: &#x60;contractors:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContractorsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.gusto-demo.com";
    
    // Configure HTTP bearer authorization: Authorization
    configuration.token = "BEARER TOKEN";
    GustoEmbeddedPayroll client = new GustoEmbeddedPayroll(configuration);
    String contractorId = "contractorId_example"; // The UUID of the contractor
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      Contractor result = client
              .contractors
              .getById(contractorId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getUuid());
      System.out.println(result.getCompanyUuid());
      System.out.println(result.getWageType());
      System.out.println(result.getIsActive());
      System.out.println(result.getType());
      System.out.println(result.getFirstName());
      System.out.println(result.getLastName());
      System.out.println(result.getMiddleInitial());
      System.out.println(result.getBusinessName());
      System.out.println(result.getEin());
      System.out.println(result.getHasEin());
      System.out.println(result.getEmail());
      System.out.println(result.getStartDate());
      System.out.println(result.getAddress());
      System.out.println(result.getHourlyRate());
      System.out.println(result.getFileNewHireReport());
      System.out.println(result.getWorkState());
      System.out.println(result.getOnboarded());
      System.out.println(result.getOnboardingStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorsApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Contractor> response = client
              .contractors
              .getById(contractorId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorsApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **contractorId** | **String**| The UUID of the contractor | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**Contractor**](Contractor.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Example response |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

<a name="getCompanyContractors"></a>
# **getCompanyContractors**
> List&lt;Contractor&gt; getCompanyContractors(companyId).page(page).per(per).xGustoAPIVersion(xGustoAPIVersion).execute();

Get contractors of a company

Get all contractors, active and inactive, individual and business, for a company.  scope: &#x60;contractors:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContractorsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.gusto-demo.com";
    
    // Configure HTTP bearer authorization: Authorization
    configuration.token = "BEARER TOKEN";
    GustoEmbeddedPayroll client = new GustoEmbeddedPayroll(configuration);
    String companyId = "companyId_example"; // The UUID of the company
    Double page = 3.4D; // The page that is requested. When unspecified, will load all objects unless endpoint forces pagination.
    Double per = 3.4D; // Number of objects per page. For majority of endpoints will default to 25
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      List<Contractor> result = client
              .contractors
              .getCompanyContractors(companyId)
              .page(page)
              .per(per)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorsApi#getCompanyContractors");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Contractor>> response = client
              .contractors
              .getCompanyContractors(companyId)
              .page(page)
              .per(per)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorsApi#getCompanyContractors");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **companyId** | **String**| The UUID of the company | |
| **page** | **Double**| The page that is requested. When unspecified, will load all objects unless endpoint forces pagination. | [optional] |
| **per** | **Double**| Number of objects per page. For majority of endpoints will default to 25 | [optional] |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**List&lt;Contractor&gt;**](Contractor.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Example response |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

<a name="getOnboardingStatus"></a>
# **getOnboardingStatus**
> ContractorOnboardingStatus getOnboardingStatus(contractorUuid).xGustoAPIVersion(xGustoAPIVersion).execute();

Get the contractor&#39;s onboarding status

Retrieves a contractor&#39;s onboarding status. The data returned helps inform the required onboarding steps and respective completion status.  scope: &#x60;contractors:read&#x60;  ## onboarding_status  ### Admin-facilitated onboarding | onboarding_status | Description | |:------------------|------------:| | &#x60;admin_onboarding_incomplete&#x60; | Admin needs to enter basic information about the contractor. | | &#x60;admin_onboarding_review&#x60; | All information has been completed and admin needs to confirm onboarding. | | &#x60;onboarding_completed&#x60; | Contractor has been fully onboarded and verified. |  ### Contractor self-onboarding  | onboarding_status | Description | | --- | ----------- | | &#x60;admin_onboarding_incomplete&#x60; | Admin needs to enter basic information about the contractor. | | &#x60;self_onboarding_not_invited&#x60; | Admin has the intention to invite the contractor to self-onboard (e.g., marking a checkbox), but the system has not yet sent the invitation. | | &#x60;self_onboarding_invited&#x60; | Contractor has been sent an invitation to self-onboard. | | &#x60;self_onboarding_started&#x60; | Contractor has started the self-onboarding process. | | &#x60;self_onboarding_review&#x60; | Admin needs to review contractors&#39;s entered information and confirm onboarding. | | &#x60;onboarding_completed&#x60; | Contractor has been fully onboarded and verified. |  ## onboarding_steps  | onboarding_steps | Requirement(s) to be completed | |:-----------------|-------------------------------:| | &#x60;basic_details&#x60; | Add individual contractor&#39;s first name, last name, social security number or Business name and EIN depending on the contractor type | | &#x60;add_address&#x60; | Add contractor address. | | &#x60;compensation_details&#x60; | Add contractor compensation. | | &#x60;payment_details&#x60; | Set up contractor&#39;s direct deposit or set to check. | | &#x60;sign_documents&#x60; | Contractor forms (e.g., W9) are generated &amp; signed. | | &#x60;file_new_hire_report&#x60; | Contractor new hire report is generated. |

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContractorsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.gusto-demo.com";
    
    // Configure HTTP bearer authorization: Authorization
    configuration.token = "BEARER TOKEN";
    GustoEmbeddedPayroll client = new GustoEmbeddedPayroll(configuration);
    String contractorUuid = "contractorUuid_example"; // The UUID of the contractor
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      ContractorOnboardingStatus result = client
              .contractors
              .getOnboardingStatus(contractorUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getUuid());
      System.out.println(result.getOnboardingStatus());
      System.out.println(result.getOnboardingSteps());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorsApi#getOnboardingStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ContractorOnboardingStatus> response = client
              .contractors
              .getOnboardingStatus(contractorUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorsApi#getOnboardingStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **contractorUuid** | **String**| The UUID of the contractor | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**ContractorOnboardingStatus**](ContractorOnboardingStatus.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Example response. |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

<a name="updateAddress"></a>
# **updateAddress**
> ContractorAddress updateAddress(contractorUuid).xGustoAPIVersion(xGustoAPIVersion).contractorsUpdateAddressRequest(contractorsUpdateAddressRequest).execute();

Update a contractor&#39;s address

The address of a contractor is used to determine certain tax information about them. Addresses are geocoded on create and update to ensure validity.  scope: &#x60;contractors:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContractorsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.gusto-demo.com";
    
    // Configure HTTP bearer authorization: Authorization
    configuration.token = "BEARER TOKEN";
    GustoEmbeddedPayroll client = new GustoEmbeddedPayroll(configuration);
    String contractorUuid = "contractorUuid_example"; // The UUID of the contractor
    String version = "version_example"; // The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
    String street1 = "street1_example";
    String street2 = "street2_example";
    String city = "city_example";
    String state = "state_example";
    String zip = "zip_example";
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      ContractorAddress result = client
              .contractors
              .updateAddress(contractorUuid)
              .version(version)
              .street1(street1)
              .street2(street2)
              .city(city)
              .state(state)
              .zip(zip)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getStreet1());
      System.out.println(result.getStreet2());
      System.out.println(result.getCity());
      System.out.println(result.getState());
      System.out.println(result.getZip());
      System.out.println(result.getCountry());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorsApi#updateAddress");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ContractorAddress> response = client
              .contractors
              .updateAddress(contractorUuid)
              .version(version)
              .street1(street1)
              .street2(street2)
              .city(city)
              .state(state)
              .zip(zip)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorsApi#updateAddress");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **contractorUuid** | **String**| The UUID of the contractor | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |
| **contractorsUpdateAddressRequest** | [**ContractorsUpdateAddressRequest**](ContractorsUpdateAddressRequest.md)|  | [optional] |

### Return type

[**ContractorAddress**](ContractorAddress.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Example response |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

<a name="updateContractor"></a>
# **updateContractor**
> Contractor updateContractor(contractorId).xGustoAPIVersion(xGustoAPIVersion).contractorsUpdateContractorRequest(contractorsUpdateContractorRequest).execute();

Update a contractor

Update a contractor.  scope: &#x60;contractors:write&#x60;  &gt; 🚧 Warning &gt; &gt; Watch out when changing a contractor&#39;s type (when the contractor is finished onboarding). Specifically, changing contractor type can be dangerous since Gusto won’t recognize and file two separate 1099s if they simply change from business to individual

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContractorsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.gusto-demo.com";
    
    // Configure HTTP bearer authorization: Authorization
    configuration.token = "BEARER TOKEN";
    GustoEmbeddedPayroll client = new GustoEmbeddedPayroll(configuration);
    String contractorId = "contractorId_example"; // The UUID of the contractor
    String version = "version_example"; // The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
    String type = "Individual"; // The contractor type.
    String wageType = "Fixed"; // The contractor’s wage type. 
    String startDate = "startDate_example"; // The day when the contractor will start working for the company. 
    String hourlyRate = "hourlyRate_example"; // The contractor’s hourly rate. This attribute is required if the wage_type is `Hourly`.
    Boolean selfOnboarding = false; // Whether the contractor or the payroll admin will complete onboarding in Gusto. Self-onboarding is recommended so that contractors receive Gusto accounts. If self_onboarding is true, then email is required.
    String email = "email_example"; // The contractor’s email address.
    String firstName = "firstName_example"; // The contractor’s first name. This attribute is required for `Individual` contractors and will be ignored for `Business` contractors.
    String lastName = "lastName_example"; // The contractor’s last name. This attribute is required for `Individual` contractors and will be ignored for `Business` contractors.
    String middleInitial = "middleInitial_example"; // The contractor’s middle initial. This attribute is optional for `Individual` contractors and will be ignored for `Business` contractors.
    Boolean fileNewHireReport = false; // The boolean flag indicating whether Gusto will file a new hire report for the contractor. This attribute is optional for `Individual` contractors and will be ignored for `Business` contractors.
    String workState = "workState_example"; // State where the contractor will be conducting the majority of their work for the company. This value is used when generating the new hire report. This attribute is required for `Individual` contractors if `file_new_hire_report` is true and will be ignored for `Business` contractors.
    String ssn = "ssn_example"; // This attribute is optional for `Individual` contractors and will be ignored for `Business` contractors. Social security number is needed to file the annual 1099 tax form.
    String businessName = "businessName_example"; // The name of the contractor business. This attribute is required for `Business` contractors and will be ignored for `Individual` contractors.
    String ein = "ein_example"; // The employer identification number of the contractor business. This attribute is optional for `Business` contractors and will be ignored for `Individual` contractors.
    Boolean isActive = true; // The status of the contractor.
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      Contractor result = client
              .contractors
              .updateContractor(contractorId)
              .version(version)
              .type(type)
              .wageType(wageType)
              .startDate(startDate)
              .hourlyRate(hourlyRate)
              .selfOnboarding(selfOnboarding)
              .email(email)
              .firstName(firstName)
              .lastName(lastName)
              .middleInitial(middleInitial)
              .fileNewHireReport(fileNewHireReport)
              .workState(workState)
              .ssn(ssn)
              .businessName(businessName)
              .ein(ein)
              .isActive(isActive)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getVersion());
      System.out.println(result.getUuid());
      System.out.println(result.getCompanyUuid());
      System.out.println(result.getWageType());
      System.out.println(result.getIsActive());
      System.out.println(result.getType());
      System.out.println(result.getFirstName());
      System.out.println(result.getLastName());
      System.out.println(result.getMiddleInitial());
      System.out.println(result.getBusinessName());
      System.out.println(result.getEin());
      System.out.println(result.getHasEin());
      System.out.println(result.getEmail());
      System.out.println(result.getStartDate());
      System.out.println(result.getAddress());
      System.out.println(result.getHourlyRate());
      System.out.println(result.getFileNewHireReport());
      System.out.println(result.getWorkState());
      System.out.println(result.getOnboarded());
      System.out.println(result.getOnboardingStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorsApi#updateContractor");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Contractor> response = client
              .contractors
              .updateContractor(contractorId)
              .version(version)
              .type(type)
              .wageType(wageType)
              .startDate(startDate)
              .hourlyRate(hourlyRate)
              .selfOnboarding(selfOnboarding)
              .email(email)
              .firstName(firstName)
              .lastName(lastName)
              .middleInitial(middleInitial)
              .fileNewHireReport(fileNewHireReport)
              .workState(workState)
              .ssn(ssn)
              .businessName(businessName)
              .ein(ein)
              .isActive(isActive)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContractorsApi#updateContractor");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **contractorId** | **String**| The UUID of the contractor | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |
| **contractorsUpdateContractorRequest** | [**ContractorsUpdateContractorRequest**](ContractorsUpdateContractorRequest.md)|  | [optional] |

### Return type

[**Contractor**](Contractor.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Example response |  -  |
| **404** | Not Found     The requested resource does not exist. Make sure the provided ID/UUID is valid.  |  -  |

