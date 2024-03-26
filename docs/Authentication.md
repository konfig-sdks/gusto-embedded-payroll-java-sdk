

# Authentication



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessToken** | **String** | A new access token that can be used for subsequent authenticated requests |  [optional] |
|**tokenType** | **String** | The literal string &#39;bearer&#39; |  [optional] |
|**expiresIn** | **Double** | The TTL of this token. After this amount of time, you must hit the refresh token endpoint to continue making authenticated requests. |  [optional] |
|**refreshToken** | **String** | A token that must be passed to the refresh token endpoint to get a new authenticated token. |  [optional] |
|**createdAt** | **String** | Datetime for when the new access token is created. |  [optional] |
|**scope** | **String** | All of the scopes for which the access token provides access. |  [optional] |



