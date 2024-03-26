

# ContractorOnboardingStatus

The representation of an contractor's onboarding status.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **String** | Unique identifier for this contractor. |  [optional] |
|**onboardingStatus** | [**OnboardingStatusEnum**](#OnboardingStatusEnum) | One of the \&quot;onboarding_status\&quot; enum values. |  [optional] |
|**onboardingSteps** | [**List&lt;OnboardingStep2&gt;**](OnboardingStep2.md) | List of steps required to onboard a contractor. |  [optional] |



## Enum: OnboardingStatusEnum

| Name | Value |
|---- | -----|
| ONBOARDING_COMPLETED | &quot;onboarding_completed&quot; |
| ADMIN_ONBOARDING_REVIEW | &quot;admin_onboarding_review&quot; |
| ADMIN_ONBOARDING_INCOMPLETE | &quot;admin_onboarding_incomplete&quot; |



