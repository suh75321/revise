package com.example.demo.service

import com.example.demo.dto.LoginRequest
import com.example.demo.dto.LoginResponse
import com.example.demo.dto.SignUpRequest
import com.example.demo.model.Member

interface MemberService {
    fun signUp(signUpRequest: SignUpRequest): Member
    fun login(loginRequest: LoginRequest): LoginResponse
    fun existsByNickName(nickname: String): Boolean // 확인을 위해 추가

}