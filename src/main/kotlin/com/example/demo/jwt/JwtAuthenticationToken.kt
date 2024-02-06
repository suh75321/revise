package com.example.demo.jwt

import com.example.demo.security.UserPrincipal
import org.springframework.security.authentication.AbstractAuthenticationToken
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.web.authentication.WebAuthenticationDetails

class JwtAuthenticationToken(
    private val principal: UserPrincipal,
    details: WebAuthenticationDetails
): AbstractAuthenticationToken(principal.authorities) {

    init {
        super.setAuthenticated(true)
        super.setDetails(details)
    }

    override fun getCredentials() = null


    override fun getPrincipal() = principal

    override fun isAuthenticated(): Boolean {
        return true
    }
}