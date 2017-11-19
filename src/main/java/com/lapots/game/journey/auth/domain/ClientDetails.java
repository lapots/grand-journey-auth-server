package com.lapots.game.journey.auth.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="client_details")
@Data
public class ClientDetails {
    @Id
    private String appId;
    private String resourceIds;
    private String appSecret;
    private String scope;
    private String grantTypes;
    private String redirectUrl;
    private String authorities;
    @Column(name="access_token_validity")
    private int accessTokenValidity;
    @Column(name="refresh_token_validity")
    private int refreshTokenValidity;
    private String additionalInformation;
}
