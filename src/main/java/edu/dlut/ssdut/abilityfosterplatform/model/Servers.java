package edu.dlut.ssdut.abilityfosterplatform.model;

import java.util.Date;

public class Servers {
    private Integer serverId;

    private String name;

    private String product;

    private String provider;

    private String dataSource;

    private String location;

    private String providerString;

    private String catalog;

    private Integer connectTimeout;

    private Integer queryTimeout;

    private Boolean isLinked;

    private Boolean isRemoteLoginEnabled;

    private Boolean isRpcOutEnabled;

    private Boolean isDataAccessEnabled;

    private Boolean isCollationCompatible;

    private Boolean usesRemoteCollation;

    private String collationName;

    private Boolean lazySchemaValidation;

    private Boolean isSystem;

    private Boolean isPublisher;

    private Boolean isSubscriber;

    private Boolean isDistributor;

    private Boolean isNonsqlSubscriber;

    private Boolean isRemoteProcTransactionPromotionEnabled;

    private Date modifyDate;

    public Integer getServerId() {
        return serverId;
    }

    public void setServerId(Integer serverId) {
        this.serverId = serverId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product == null ? null : product.trim();
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider == null ? null : provider.trim();
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource == null ? null : dataSource.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getProviderString() {
        return providerString;
    }

    public void setProviderString(String providerString) {
        this.providerString = providerString == null ? null : providerString.trim();
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog == null ? null : catalog.trim();
    }

    public Integer getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(Integer connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public Integer getQueryTimeout() {
        return queryTimeout;
    }

    public void setQueryTimeout(Integer queryTimeout) {
        this.queryTimeout = queryTimeout;
    }

    public Boolean getIsLinked() {
        return isLinked;
    }

    public void setIsLinked(Boolean isLinked) {
        this.isLinked = isLinked;
    }

    public Boolean getIsRemoteLoginEnabled() {
        return isRemoteLoginEnabled;
    }

    public void setIsRemoteLoginEnabled(Boolean isRemoteLoginEnabled) {
        this.isRemoteLoginEnabled = isRemoteLoginEnabled;
    }

    public Boolean getIsRpcOutEnabled() {
        return isRpcOutEnabled;
    }

    public void setIsRpcOutEnabled(Boolean isRpcOutEnabled) {
        this.isRpcOutEnabled = isRpcOutEnabled;
    }

    public Boolean getIsDataAccessEnabled() {
        return isDataAccessEnabled;
    }

    public void setIsDataAccessEnabled(Boolean isDataAccessEnabled) {
        this.isDataAccessEnabled = isDataAccessEnabled;
    }

    public Boolean getIsCollationCompatible() {
        return isCollationCompatible;
    }

    public void setIsCollationCompatible(Boolean isCollationCompatible) {
        this.isCollationCompatible = isCollationCompatible;
    }

    public Boolean getUsesRemoteCollation() {
        return usesRemoteCollation;
    }

    public void setUsesRemoteCollation(Boolean usesRemoteCollation) {
        this.usesRemoteCollation = usesRemoteCollation;
    }

    public String getCollationName() {
        return collationName;
    }

    public void setCollationName(String collationName) {
        this.collationName = collationName == null ? null : collationName.trim();
    }

    public Boolean getLazySchemaValidation() {
        return lazySchemaValidation;
    }

    public void setLazySchemaValidation(Boolean lazySchemaValidation) {
        this.lazySchemaValidation = lazySchemaValidation;
    }

    public Boolean getIsSystem() {
        return isSystem;
    }

    public void setIsSystem(Boolean isSystem) {
        this.isSystem = isSystem;
    }

    public Boolean getIsPublisher() {
        return isPublisher;
    }

    public void setIsPublisher(Boolean isPublisher) {
        this.isPublisher = isPublisher;
    }

    public Boolean getIsSubscriber() {
        return isSubscriber;
    }

    public void setIsSubscriber(Boolean isSubscriber) {
        this.isSubscriber = isSubscriber;
    }

    public Boolean getIsDistributor() {
        return isDistributor;
    }

    public void setIsDistributor(Boolean isDistributor) {
        this.isDistributor = isDistributor;
    }

    public Boolean getIsNonsqlSubscriber() {
        return isNonsqlSubscriber;
    }

    public void setIsNonsqlSubscriber(Boolean isNonsqlSubscriber) {
        this.isNonsqlSubscriber = isNonsqlSubscriber;
    }

    public Boolean getIsRemoteProcTransactionPromotionEnabled() {
        return isRemoteProcTransactionPromotionEnabled;
    }

    public void setIsRemoteProcTransactionPromotionEnabled(Boolean isRemoteProcTransactionPromotionEnabled) {
        this.isRemoteProcTransactionPromotionEnabled = isRemoteProcTransactionPromotionEnabled;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }
}