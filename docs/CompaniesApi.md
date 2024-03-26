# CompaniesApi

All URIs are relative to *https://api.gusto-demo.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**acceptTermsOfService**](CompaniesApi.md#acceptTermsOfService) | **POST** /v1/partner_managed_companies/{company_uuid}/accept_terms_of_service | Accept terms of service for a company user |
| [**createAdmin**](CompaniesApi.md#createAdmin) | **POST** /v1/companies/{company_id}/admins | Create an admin for the company |
| [**createPartnerManagedCompany**](CompaniesApi.md#createPartnerManagedCompany) | **POST** /v1/partner_managed_companies | Create a partner managed company |
| [**finishOnboarding**](CompaniesApi.md#finishOnboarding) | **PUT** /v1/companies/{company_uuid}/finish_onboarding | Finish company onboarding |
| [**getAllAdmins**](CompaniesApi.md#getAllAdmins) | **GET** /v1/companies/{company_id}/admins | Get all the admins at a company |
| [**getCompany**](CompaniesApi.md#getCompany) | **GET** /v1/companies/{company_id} | Get a company |
| [**getCustomFields**](CompaniesApi.md#getCustomFields) | **GET** /v1/companies/{company_id}/custom_fields | Get the custom fields of a company |
| [**getOnboardingStatus**](CompaniesApi.md#getOnboardingStatus) | **GET** /v1/companies/{company_uuid}/onboarding_status | Get the company&#39;s onboarding status |
| [**getTermsOfServiceStatus**](CompaniesApi.md#getTermsOfServiceStatus) | **POST** /v1/partner_managed_companies/{company_uuid}/retrieve_terms_of_service | Retrieve terms of service status for a company user |
| [**migrateToEmbeddedPayroll**](CompaniesApi.md#migrateToEmbeddedPayroll) | **PUT** /v1/partner_managed_companies/{company_uuid}/migrate | Migrate company to embedded payroll |


<a name="acceptTermsOfService"></a>
# **acceptTermsOfService**
> CompaniesAcceptTermsOfServiceResponse acceptTermsOfService(companyUuid).xGustoAPIVersion(xGustoAPIVersion).companiesAcceptTermsOfServiceRequest(companiesAcceptTermsOfServiceRequest).execute();

Accept terms of service for a company user

Accept the Gusto Embedded Payroll&#39;s [Terms of Service](https://flows.gusto.com/terms). The user must have a role in the company in order to accept the Terms of Service.  scope: &#x60;terms_of_services:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompaniesApi;
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
    String email = "email_example"; // The user's email address on Gusto. You can retrieve the user's email via company's `/admins`, `/employees`, `/signatories`, and `/contractors` endpoints.
    String ipAddress = "ipAddress_example"; // The IP address of the user who viewed and accepted the Terms of Service.
    String externalUserId = "externalUserId_example"; // The user ID on your platform.
    String companyUuid = "companyUuid_example"; // The UUID of the company
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      CompaniesAcceptTermsOfServiceResponse result = client
              .companies
              .acceptTermsOfService(email, ipAddress, externalUserId, companyUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getLatestTermsAccepted());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompaniesApi#acceptTermsOfService");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CompaniesAcceptTermsOfServiceResponse> response = client
              .companies
              .acceptTermsOfService(email, ipAddress, externalUserId, companyUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompaniesApi#acceptTermsOfService");
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
| **companyUuid** | **String**| The UUID of the company | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |
| **companiesAcceptTermsOfServiceRequest** | [**CompaniesAcceptTermsOfServiceRequest**](CompaniesAcceptTermsOfServiceRequest.md)|  | [optional] |

### Return type

[**CompaniesAcceptTermsOfServiceResponse**](CompaniesAcceptTermsOfServiceResponse.md)

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

<a name="createAdmin"></a>
# **createAdmin**
> Admin createAdmin(companyId).xGustoAPIVersion(xGustoAPIVersion).companiesCreateAdminRequest(companiesCreateAdminRequest).execute();

Create an admin for the company

Creates a new admin for a company. If the email matches an existing user, this will create an admin account for the current user. Otherwise, this will create a new user.  scope: &#x60;company_admin:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompaniesApi;
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
    String firstName = "firstName_example"; // The first name of the admin.
    String lastName = "lastName_example"; // The last name of the admin.
    String email = "email_example"; // The email of the admin for Gusto's system. If the email matches an existing user, this will create an admin account for them.
    String companyId = "companyId_example"; // The UUID of the company
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      Admin result = client
              .companies
              .createAdmin(firstName, lastName, email, companyId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getUuid());
      System.out.println(result.getEmail());
      System.out.println(result.getFirstName());
      System.out.println(result.getLastName());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompaniesApi#createAdmin");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Admin> response = client
              .companies
              .createAdmin(firstName, lastName, email, companyId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompaniesApi#createAdmin");
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
| **companiesCreateAdminRequest** | [**CompaniesCreateAdminRequest**](CompaniesCreateAdminRequest.md)|  | [optional] |

### Return type

[**Admin**](Admin.md)

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

<a name="createPartnerManagedCompany"></a>
# **createPartnerManagedCompany**
> CompaniesCreatePartnerManagedCompanyResponse createPartnerManagedCompany().xGustoAPIVersion(xGustoAPIVersion).companiesCreatePartnerManagedCompanyRequest(companiesCreatePartnerManagedCompanyRequest).execute();

Create a partner managed company

Create a partner managed company. When you successfully call the API, it does the following: * Creates a new company in Gusto * Creates a new user using the provided email if the user does not already exist. * Makes the user the primary payroll administrator of the new company.  In response, you will receive oauth access tokens for the created company.  IMPORTANT: the returned access and refresh tokens are reserved for this company only. They cannot be used to access other companies AND previously granted tokens cannot be used to access this company.  &gt; 📘 Token Authentication &gt; &gt; this endpoint uses the [organization level api token and the Token scheme with HTTP Authorization header](https://docs.gusto.com/embedded-payroll/docs/authentication#retrieving-access-tokens)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompaniesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.gusto-demo.com";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    GustoEmbeddedPayroll client = new GustoEmbeddedPayroll(configuration);
    CompaniesCreatePartnerManagedCompanyRequestUser user = new CompaniesCreatePartnerManagedCompanyRequestUser();
    CompaniesCreatePartnerManagedCompanyRequestCompany company = new CompaniesCreatePartnerManagedCompanyRequestCompany();
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      CompaniesCreatePartnerManagedCompanyResponse result = client
              .companies
              .createPartnerManagedCompany(user, company)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccessToken());
      System.out.println(result.getRefreshToken());
      System.out.println(result.getCompanyUuid());
      System.out.println(result.getExpiresIn());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompaniesApi#createPartnerManagedCompany");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CompaniesCreatePartnerManagedCompanyResponse> response = client
              .companies
              .createPartnerManagedCompany(user, company)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompaniesApi#createPartnerManagedCompany");
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
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |
| **companiesCreatePartnerManagedCompanyRequest** | [**CompaniesCreatePartnerManagedCompanyRequest**](CompaniesCreatePartnerManagedCompanyRequest.md)|  | [optional] |

### Return type

[**CompaniesCreatePartnerManagedCompanyResponse**](CompaniesCreatePartnerManagedCompanyResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Authorization information is missing or invalid. |  -  |

<a name="finishOnboarding"></a>
# **finishOnboarding**
> CompanyOnboardingStatus finishOnboarding(companyUuid).xGustoAPIVersion(xGustoAPIVersion).execute();

Finish company onboarding

Finalize a given company&#39;s onboarding process.  ### Approve a company in demo After a company is finished onboarding, Gusto requires an additional step to review and approve that company. In production environments, this step is required for risk-analysis purposes.  We provide the endpoint &#x60;PUT &#39;/v1/companies/{company_uuid}/approve&#39;&#x60; to facilitate company approvals in the demo environment.  &#x60;&#x60;&#x60;shell PUT &#39;/v1/companies/89771af8-b964-472e-8064-554dfbcb56d9/approve&#39;  # Response: Company object, with company_status: &#39;Approved&#39; &#x60;&#x60;&#x60;  scope: &#x60;companies:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompaniesApi;
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
    String companyUuid = "companyUuid_example"; // The UUID of the company
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      CompanyOnboardingStatus result = client
              .companies
              .finishOnboarding(companyUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getUuid());
      System.out.println(result.getOnboardingCompleted());
      System.out.println(result.getOnboardingSteps());
      System.out.println(result.get());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompaniesApi#finishOnboarding");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CompanyOnboardingStatus> response = client
              .companies
              .finishOnboarding(companyUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompaniesApi#finishOnboarding");
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
| **companyUuid** | **String**| The UUID of the company | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**CompanyOnboardingStatus**](CompanyOnboardingStatus.md)

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

<a name="getAllAdmins"></a>
# **getAllAdmins**
> List&lt;Admin&gt; getAllAdmins(companyId).page(page).per(per).xGustoAPIVersion(xGustoAPIVersion).execute();

Get all the admins at a company

Returns a list of all the admins at a company  scope: &#x60;company_admin:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompaniesApi;
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
      List<Admin> result = client
              .companies
              .getAllAdmins(companyId)
              .page(page)
              .per(per)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompaniesApi#getAllAdmins");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Admin>> response = client
              .companies
              .getAllAdmins(companyId)
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
      System.err.println("Exception when calling CompaniesApi#getAllAdmins");
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

[**List&lt;Admin&gt;**](Admin.md)

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

<a name="getCompany"></a>
# **getCompany**
> Company getCompany(companyId).xGustoAPIVersion(xGustoAPIVersion).execute();

Get a company

Get a company.          The employees:read scope is required to return home_address and non-work locations.          The company_admin:read scope is required to return primary_payroll_admin.          The signatories:read scope is required to return primary_signatory.           scope: &#x60;companies:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompaniesApi;
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
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      Company result = client
              .companies
              .getCompany(companyId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getEin());
      System.out.println(result.getEntityType());
      System.out.println(result.getTier());
      System.out.println(result.getIsSuspended());
      System.out.println(result.getCompanyStatus());
      System.out.println(result.getUuid());
      System.out.println(result.getName());
      System.out.println(result.getTradeName());
      System.out.println(result.getIsPartnerManaged());
      System.out.println(result.getPayScheduleType());
      System.out.println(result.getJoinDate());
      System.out.println(result.getFundingType());
      System.out.println(result.getLocations());
      System.out.println(result.getCompensations());
      System.out.println(result.getPrimarySignatory());
      System.out.println(result.getPrimaryPayrollAdmin());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompaniesApi#getCompany");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Company> response = client
              .companies
              .getCompany(companyId)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompaniesApi#getCompany");
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

### Return type

[**Company**](Company.md)

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

<a name="getCustomFields"></a>
# **getCustomFields**
> CompaniesGetCustomFieldsResponse getCustomFields(companyId).page(page).per(per).xGustoAPIVersion(xGustoAPIVersion).execute();

Get the custom fields of a company

Returns a list of the custom fields of the company. Useful when you need to know the schema of custom fields for an entire company  scope: &#x60;companies:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompaniesApi;
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
      CompaniesGetCustomFieldsResponse result = client
              .companies
              .getCustomFields(companyId)
              .page(page)
              .per(per)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getCustomFields());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompaniesApi#getCustomFields");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CompaniesGetCustomFieldsResponse> response = client
              .companies
              .getCustomFields(companyId)
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
      System.err.println("Exception when calling CompaniesApi#getCustomFields");
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

[**CompaniesGetCustomFieldsResponse**](CompaniesGetCustomFieldsResponse.md)

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
> CompanyOnboardingStatus getOnboardingStatus(companyUuid).xGustoAPIVersion(xGustoAPIVersion).execute();

Get the company&#39;s onboarding status

Get company&#39;s onboarding status. The data returned helps inform the required onboarding steps and respective completion status.  scope: &#x60;company_onboarding_status:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompaniesApi;
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
    String companyUuid = "companyUuid_example"; // The UUID of the company
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      CompanyOnboardingStatus result = client
              .companies
              .getOnboardingStatus(companyUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getUuid());
      System.out.println(result.getOnboardingCompleted());
      System.out.println(result.getOnboardingSteps());
      System.out.println(result.get());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompaniesApi#getOnboardingStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CompanyOnboardingStatus> response = client
              .companies
              .getOnboardingStatus(companyUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompaniesApi#getOnboardingStatus");
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
| **companyUuid** | **String**| The UUID of the company | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |

### Return type

[**CompanyOnboardingStatus**](CompanyOnboardingStatus.md)

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

<a name="getTermsOfServiceStatus"></a>
# **getTermsOfServiceStatus**
> CompaniesGetTermsOfServiceStatusResponse getTermsOfServiceStatus(companyUuid).xGustoAPIVersion(xGustoAPIVersion).companiesGetTermsOfServiceStatusRequest(companiesGetTermsOfServiceStatusRequest).execute();

Retrieve terms of service status for a company user

Retrieve the user acceptance status of the Gusto Embedded Payroll&#39;s [Terms of Service](https://flows.gusto.com/terms).  scope: &#x60;terms_of_services:read&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompaniesApi;
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
    String email = "email_example"; // The user's email address on Gusto. You can retrieve the user's email via company's `/admins`, `/employees`, `/signatories`, and `/contractors` endpoints.
    String companyUuid = "companyUuid_example"; // The UUID of the company
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      CompaniesGetTermsOfServiceStatusResponse result = client
              .companies
              .getTermsOfServiceStatus(email, companyUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getLatestTermsAccepted());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompaniesApi#getTermsOfServiceStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CompaniesGetTermsOfServiceStatusResponse> response = client
              .companies
              .getTermsOfServiceStatus(email, companyUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompaniesApi#getTermsOfServiceStatus");
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
| **companyUuid** | **String**| The UUID of the company | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |
| **companiesGetTermsOfServiceStatusRequest** | [**CompaniesGetTermsOfServiceStatusRequest**](CompaniesGetTermsOfServiceStatusRequest.md)|  | [optional] |

### Return type

[**CompaniesGetTermsOfServiceStatusResponse**](CompaniesGetTermsOfServiceStatusResponse.md)

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

<a name="migrateToEmbeddedPayroll"></a>
# **migrateToEmbeddedPayroll**
> CompaniesMigrateToEmbeddedPayrollResponse migrateToEmbeddedPayroll(companyUuid).xGustoAPIVersion(xGustoAPIVersion).companiesMigrateToEmbeddedPayrollRequest(companiesMigrateToEmbeddedPayrollRequest).execute();

Migrate company to embedded payroll

Migrate an existing Gusto customer to your embedded payroll product.  To use this endpoint, the customer will need to connect their Gusto account to your application using [OAuth2](https://docs.gusto.com/embedded-payroll/docs/oauth2) then view and [accept the Embedded Payroll Terms of Service](https://docs.gusto.com/embedded-payroll/reference/post-partner-managed-companies-company_uuid-accept_terms_of_service).  scope: &#x60;partner_managed_companies:write&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.GustoEmbeddedPayroll;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompaniesApi;
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
    String email = "email_example"; // Email of the company signatory who is authorized to accept our [Terms of Service](https://flows.gusto.com/terms) and migration decision. You can retrieve the signatory email from the `GET /v/1/companies/{company_id}/signatories` endpoint.
    String ipAddress = "ipAddress_example"; // The IP address of the signatory who viewed and accepted the Terms of Service.
    String externalUserId = "externalUserId_example"; // The signatory's user ID on your platform.
    String companyUuid = "companyUuid_example"; // The UUID of the company
    String xGustoAPIVersion = "2024-03-01"; // Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
    try {
      CompaniesMigrateToEmbeddedPayrollResponse result = client
              .companies
              .migrateToEmbeddedPayroll(email, ipAddress, externalUserId, companyUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .execute();
      System.out.println(result);
      System.out.println(result.getCompanyUuid());
      System.out.println(result.getMigrationStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompaniesApi#migrateToEmbeddedPayroll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CompaniesMigrateToEmbeddedPayrollResponse> response = client
              .companies
              .migrateToEmbeddedPayroll(email, ipAddress, externalUserId, companyUuid)
              .xGustoAPIVersion(xGustoAPIVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompaniesApi#migrateToEmbeddedPayroll");
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
| **companyUuid** | **String**| The UUID of the company | |
| **xGustoAPIVersion** | **String**| Determines the date-based API version associated with your API call. If none is provided, your application&#39;s [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. | [optional] [enum: 2024-03-01] |
| **companiesMigrateToEmbeddedPayrollRequest** | [**CompaniesMigrateToEmbeddedPayrollRequest**](CompaniesMigrateToEmbeddedPayrollRequest.md)|  | [optional] |

### Return type

[**CompaniesMigrateToEmbeddedPayrollResponse**](CompaniesMigrateToEmbeddedPayrollResponse.md)

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

