package net.ntworld.mergeRequestIntegration.provider.gitlab.request

import net.ntworld.foundation.Request
import net.ntworld.mergeRequest.api.ApiCredentials
import net.ntworld.mergeRequestIntegration.provider.gitlab.GitlabRequest
import net.ntworld.mergeRequestIntegration.provider.gitlab.response.GitlabFindProjectResponse

data class GitlabFindProjectRequest(
    override val credentials: ApiCredentials,
    val projectId: Int,
    val projectPath: String = ""
) : GitlabRequest, Request<GitlabFindProjectResponse>
