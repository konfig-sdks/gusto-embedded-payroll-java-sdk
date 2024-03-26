

# Employee

The representation of an employee in Gusto.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**version** | **String** | The current version of the employee. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field. |  [optional] [readonly] |
|**uuid** | **String** | The UUID of the employee in Gusto. |  [optional] [readonly] |
|**firstName** | **String** |  |  [optional] |
|**middleInitial** | **String** |  |  [optional] |
|**lastName** | **String** |  |  [optional] |
|**email** | **String** | The email address of the employee. This is provided to support syncing users between our system and yours. You may not use this email address for any other purpose (e.g. marketing). |  [optional] |
|**companyUuid** | **String** | The UUID of the company the employee is employed by. |  [optional] [readonly] |
|**managerUuid** | **String** | The UUID of the employee&#39;s manager. |  [optional] [readonly] |
|**department** | **String** | The employee&#39;s department in the company. |  [optional] [readonly] |
|**terminated** | **Boolean** | Whether the employee is terminated. |  [optional] [readonly] |
|**twoPercentShareholder** | **Boolean** | Whether the employee is a two percent shareholder of the company. This field only applies to companies with an S-Corp entity type. |  [optional] |
|**onboarded** | **Boolean** | Whether the employee has completed onboarding. |  [optional] [readonly] |
|**onboardingStatus** | [**OnboardingStatusEnum**](#OnboardingStatusEnum) | The current onboarding status of the employee |  [optional] [readonly] |
|**jobs** | [**List&lt;Job&gt;**](Job.md) |  |  [optional] |
|**eligiblePaidTimeOff** | [**List&lt;PaidTimeOff&gt;**](PaidTimeOff.md) |  |  [optional] |
|**terminations** | [**List&lt;Termination&gt;**](Termination.md) |  |  [optional] |
|**garnishments** | [**List&lt;Garnishment&gt;**](Garnishment.md) |  |  [optional] |
|**customFields** | [**List&lt;EmployeeCustomField&gt;**](EmployeeCustomField.md) | Custom fields are only included for the employee if the include param has the custom_fields value set |  [optional] |
|**dateOfBirth** | **String** |  |  [optional] [readonly] |
|**hasSsn** | **Boolean** | Indicates whether the employee has an SSN in Gusto. |  [optional] |
|**ssn** | **String** | Deprecated. This field always returns an empty string. |  [optional] |
|**phone** | **String** |  |  [optional] |
|**preferredFirstName** | **String** |  |  [optional] |
|**paymentMethod** | [**PaymentMethodEnum**](#PaymentMethodEnum) | The employee&#39;s payment method |  [optional] |
|**workEmail** | **String** | The work email address of the employee. This is provided to support syncing users between our system and yours. You may not use this email address for any other purpose (e.g. marketing). |  [optional] |
|**currentEmploymentStatus** | [**CurrentEmploymentStatusEnum**](#CurrentEmploymentStatusEnum) | The current employment status of the employee. Full-time employees work 30+ hours per week. Part-time employees are split into two groups: those that work 20-29 hours a week, and those that work under 20 hours a week. Variable employees have hours that vary each week. Seasonal employees are hired for 6 months of the year or less. |  [optional] [readonly] |



## Enum: OnboardingStatusEnum

| Name | Value |
|---- | -----|
| ONBOARDING_COMPLETED | &quot;onboarding_completed&quot; |
| ADMIN_ONBOARDING_INCOMPLETE | &quot;admin_onboarding_incomplete&quot; |
| SELF_ONBOARDING_PENDING_INVITE | &quot;self_onboarding_pending_invite&quot; |
| SELF_ONBOARDING_INVITED | &quot;self_onboarding_invited&quot; |
| SELF_ONBOARDING_INVITED_STARTED | &quot;self_onboarding_invited_started&quot; |
| SELF_ONBOARDING_INVITED_OVERDUE | &quot;self_onboarding_invited_overdue&quot; |
| SELF_ONBOARDING_COMPLETED_BY_EMPLOYEE | &quot;self_onboarding_completed_by_employee&quot; |
| SELF_ONBOARDING_AWAITING_ADMIN_REVIEW | &quot;self_onboarding_awaiting_admin_review&quot; |



## Enum: PaymentMethodEnum

| Name | Value |
|---- | -----|
| DIRECT_DEPOSIT | &quot;Direct Deposit&quot; |
| CHECK | &quot;Check&quot; |



## Enum: CurrentEmploymentStatusEnum

| Name | Value |
|---- | -----|
| FULL_TIME | &quot;full_time&quot; |
| PART_TIME_UNDER_TWENTY_HOURS | &quot;part_time_under_twenty_hours&quot; |
| PART_TIME_TWENTY_PLUS_HOURS | &quot;part_time_twenty_plus_hours&quot; |
| VARIABLE | &quot;variable&quot; |
| SEASONAL | &quot;seasonal&quot; |



