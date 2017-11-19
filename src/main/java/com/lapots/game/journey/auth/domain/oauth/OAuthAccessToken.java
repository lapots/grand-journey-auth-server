package com.lapots.game.journey.auth.domain.oauth;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="oauth_access_token")
@Data
public class OAuthAccessToken {
    @Column(name="token_id")
    private String tokenId;
    private byte[] token;
    @Column(name="authentication_id")
    private String authenticationId;
    @Column(name="user_name")
    private String userName;
    @Column(name="client_id")
    private String clientId;
    private byte[] authentication;
    @Column(name="refresh_token")
    private String refreshToken;
}
