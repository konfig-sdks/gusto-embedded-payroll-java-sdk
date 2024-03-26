

# EmployeeEmploymentsGetHistoryResponseInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**hireDate** | **String** | The employee&#39;s start day of work for an employment. |  [optional] |
|**terminationDate** | **String** | The employee&#39;s last day of work for an employment. |  [optional] |
|**fileNewHireReport** | **Boolean** | The boolean flag indicating whether Gusto will file a new hire report for the employee. |  [optional] |
|**twoPercentShareholder** | **Boolean** | Whether the employee is a two percent shareholder of the company. This field only applies to companies with an S-Corp entity type. |  [optional] |
|**employmentStatus** | [**EmploymentStatusEnum**](#EmploymentStatusEnum) | The employee&#39;s employment status. Supplying an invalid option will set the employment_status to *not_set*. |  [optional] |



## Enum: EmploymentStatusEnum

| Name | Value |
|---- | -----|
| PART_TIME | &quot;part_time&quot; |
| FULL_TIME | &quot;full_time&quot; |
| PART_TIME_ELIGIBLE | &quot;part_time_eligible&quot; |
| VARIABLE | &quot;variable&quot; |
| SEASONAL | &quot;seasonal&quot; |
| NOT_SET | &quot;not_set&quot; |



