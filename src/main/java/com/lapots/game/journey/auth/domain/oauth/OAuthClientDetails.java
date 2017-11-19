package com.lapots.game.journey.auth.domain.oauth;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="oauth_client_details")
@Data
public class OAuthClientDetails {
    @Id
    @Column(name="client_id", nullable=false)
    private String clientId;
    @Column(name="resource_ids")
    private String resourceIds;
    @Column(name="client_secret")
    private String clientSecret;
    private String scope;
    @Column(name="authorized_grant_types")
    private String authorizedGrantTypes;
    @Column(name="web_server_redirect_uri")
    private String webServerRedirectUrl;
    @Column(name="authorities")
    private String authorities;
    @Column(name="access_token_validity")
    private String accessTokenValidity;
    @Column(name="refresh_token_validity")
    private String refreshTokenValidity;
    @Column(name="additional_information")
    private String additionalInformation;
    private String autoapprove;
}
