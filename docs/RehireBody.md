

# RehireBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**effectiveDate** | **String** | The day when the employee returns to work. |  |
|**fileNewHireReport** | **Boolean** | The boolean flag indicating whether Gusto will file a new hire report for the employee. |  |
|**workLocationUuid** | **String** | The uuid of the employee&#39;s work location. |  |
|**employmentStatus** | [**EmploymentStatusEnum**](#EmploymentStatusEnum) | The employee&#39;s employment status. Supplying an invalid option will set the employment_status to *not_set*. |  [optional] |
|**twoPercentShareholder** | **Boolean** | Whether the employee is a two percent shareholder of the company. This field only applies to companies with an S-Corp entity type. |  [optional] |



## Enum: EmploymentStatusEnum

| Name | Value |
|---- | -----|
| PART_TIME | &quot;part_time&quot; |
| FULL_TIME | &quot;full_time&quot; |
| PART_TIME_ELIGIBLE | &quot;part_time_eligible&quot; |
| VARIABLE | &quot;variable&quot; |
| SEASONAL | &quot;seasonal&quot; |
| NOT_SET | &quot;not_set&quot; |



