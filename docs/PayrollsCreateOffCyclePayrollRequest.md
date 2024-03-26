

# PayrollsCreateOffCyclePayrollRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**offCycle** | **Boolean** | Whether it is an off cycle payroll. |  |
|**offCycleReason** | [**OffCycleReasonEnum**](#OffCycleReasonEnum) | An off cycle payroll reason. Select one from the following list. |  |
|**startDate** | **String** | Pay period start date. |  |
|**endDate** | **String** | Pay period end date. |  |
|**payScheduleUuid** | **String** | A pay schedule is required for Transition from old pay schedule payroll to identify the matching transition pay period. |  [optional] |
|**employeeUuids** | **List&lt;String&gt;** | A list of employee uuids to include on the payroll. |  [optional] |
|**checkDate** | **String** | Payment date. |  [optional] |
|**withholdingPayPeriod** | [**WithholdingPayPeriodEnum**](#WithholdingPayPeriodEnum) | The payment schedule tax rate the payroll is based on |  [optional] |
|**skipRegularDeductions** | **Boolean** | Block regular deductions and contributions for this payroll. |  [optional] |
|**fixedWithholdingRate** | **Boolean** | Enable taxes to be withheld at the IRS&#39;s required rate of 22% for federal income taxes. State income taxes will be taxed at the state&#39;s supplemental tax rate. Otherwise, we&#39;ll sum the entirety of the employee&#39;s wages and withhold taxes on the entire amount at the rate for regular wages. |  [optional] |



## Enum: OffCycleReasonEnum

| Name | Value |
|---- | -----|
| BONUS | &quot;Bonus&quot; |
| CORRECTION | &quot;Correction&quot; |
| DISMISSED_EMPLOYEE | &quot;Dismissed employee&quot; |
| TRANSITION_FROM_OLD_PAY_SCHEDULE | &quot;Transition from old pay schedule&quot; |



## Enum: WithholdingPayPeriodEnum

| Name | Value |
|---- | -----|
| EVERY_WEEK | &quot;Every week&quot; |
| EVERY_OTHER_WEEK | &quot;Every other week&quot; |
| TWICE_PER_MONTH | &quot;Twice per month&quot; |
| MONTHLY | &quot;Monthly&quot; |
| QUARTERLY | &quot;Quarterly&quot; |
| SEMIANNUALLY | &quot;Semiannually&quot; |
| ANNUALLY | &quot;Annually&quot; |



