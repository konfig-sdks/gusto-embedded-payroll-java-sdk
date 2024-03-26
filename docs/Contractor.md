

# Contractor

The representation of a contractor (individual or business) in Gusto.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**version** | **String** | The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field. |  [optional] |
|**uuid** | **String** | The UUID of the contractor in Gusto. |  [optional] [readonly] |
|**companyUuid** | **String** | The UUID of the company the contractor is employed by. |  [optional] [readonly] |
|**wageType** | [**WageTypeEnum**](#WageTypeEnum) | The contractor&#39;s wage type, either \&quot;Fixed\&quot; or \&quot;Hourly\&quot;. |  [optional] |
|**isActive** | **Boolean** | The status of the contractor with the company. |  [optional] [readonly] |
|**type** | [**TypeEnum**](#TypeEnum) | The contractor&#39;s type, either \&quot;Individual\&quot; or \&quot;Business\&quot;.  |  [optional] |
|**firstName** | **String** | The contractor’s first name. This attribute is required for “Individual” contractors and will be ignored for “Business” contractors. |  [optional] |
|**lastName** | **String** | The contractor’s last name. This attribute is required for “Individual” contractors and will be ignored for “Business” contractors. |  [optional] |
|**middleInitial** | **String** | The contractor’s middle initial. This attribute is optional for “Individual” contractors and will be ignored for “Business” contractors. |  [optional] |
|**businessName** | **String** | The name of the contractor business. This attribute is required for “Business” contractors and will be ignored for “Individual” contractors. |  [optional] |
|**ein** | **String** | The Federal Employer Identification Number of the contractor business. This attribute is optional for “Business” contractors and will be ignored for “Individual” contractors. |  [optional] |
|**hasEin** | **Boolean** | Whether company&#39;s Employer Identification Number (EIN) is present |  [optional] |
|**email** | **String** | The contractor’s email address. This attribute is optional for “Individual” contractors and will be ignored for “Business” contractors.  |  [optional] |
|**startDate** | **String** | The contractor&#39;s start date. |  [optional] [readonly] |
|**address** | [**ContractorAddress**](ContractorAddress.md) |  |  [optional] |
|**hourlyRate** | **String** | The contractor’s hourly rate. This attribute is required if the wage_type is “Hourly”. |  [optional] |
|**fileNewHireReport** | **Boolean** | The boolean flag indicating whether Gusto will file a new hire report for the contractor |  [optional] |
|**workState** | **String** | State where the contractor will be conducting the majority of their work for the company. This value is used when generating the new hire report. |  [optional] |
|**onboarded** | **Boolean** | The updated onboarding status for the contractor |  [optional] |
|**onboardingStatus** | [**OnboardingStatusEnum**](#OnboardingStatusEnum) | One of the \&quot;onboarding_status\&quot; enum values. |  [optional] |



## Enum: WageTypeEnum

| Name | Value |
|---- | -----|
| FIXED | &quot;Fixed&quot; |
| HOURLY | &quot;Hourly&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| INDIVIDUAL | &quot;Individual&quot; |
| BUSINESS | &quot;Business&quot; |



## Enum: OnboardingStatusEnum

| Name | Value |
|---- | -----|
| ONBOARDING_COMPLETED | &quot;onboarding_completed&quot; |
| ADMIN_ONBOARDING_REVIEW | &quot;admin_onboarding_review&quot; |
| ADMIN_ONBOARDING_INCOMPLETE | &quot;admin_onboarding_incomplete&quot; |



