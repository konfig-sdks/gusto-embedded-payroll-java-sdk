

# WebhookSubscription

The representation of webhook subscription.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **String** | The UUID of the webhook subscription. |  [optional] [readonly] |
|**url** | **String** | The webhook subscriber URL. Updates will be POSTed to this URL. |  [optional] [readonly] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the webhook subscription. |  [optional] [readonly] |
|**subscriptionTypes** | [**List&lt;SubscriptionTypesEnum&gt;**](#List&lt;SubscriptionTypesEnum&gt;) | Receive updates for these types. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| VERIFIED | &quot;verified&quot; |
| REMOVED | &quot;removed&quot; |



## Enum: List&lt;SubscriptionTypesEnum&gt;

| Name | Value |
|---- | -----|
| BANKACCOUNT | &quot;BankAccount&quot; |
| COMPANY | &quot;Company&quot; |
| COMPANYBENEFIT | &quot;CompanyBenefit&quot; |
| CONTRACTOR | &quot;Contractor&quot; |
| CONTRACTORPAYMENT | &quot;ContractorPayment&quot; |
| EMPLOYEE | &quot;Employee&quot; |
| EMPLOYEEBENEFIT | &quot;EmployeeBenefit&quot; |
| EMPLOYEEJOBCOMPENSATION | &quot;EmployeeJobCompensation&quot; |
| EXTERNALPAYROLL | &quot;ExternalPayroll&quot; |
| FORM | &quot;Form&quot; |
| LOCATION | &quot;Location&quot; |
| NOTIFICATION | &quot;Notification&quot; |
| PAYROLL | &quot;Payroll&quot; |
| PAYSCHEDULE | &quot;PaySchedule&quot; |
| SIGNATORY | &quot;Signatory&quot; |



