//
// This file generated by rdl 1.4.8. Do not modify!
//

package com.yahoo.athenz.zms;
import java.util.List;
import com.yahoo.rdl.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

//
// DomainPolicies - We need to include the name of the domain in this struct
// since this data will be passed back to ZPU through ZTS so we need to sign not
// only the list of policies but also the corresponding domain name that the
// policies belong to.
//
@JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
public class DomainPolicies {
    public String domain;
    public List<Policy> policies;

    public DomainPolicies setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return domain;
    }
    public DomainPolicies setPolicies(List<Policy> policies) {
        this.policies = policies;
        return this;
    }
    public List<Policy> getPolicies() {
        return policies;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != DomainPolicies.class) {
                return false;
            }
            DomainPolicies a = (DomainPolicies) another;
            if (domain == null ? a.domain != null : !domain.equals(a.domain)) {
                return false;
            }
            if (policies == null ? a.policies != null : !policies.equals(a.policies)) {
                return false;
            }
        }
        return true;
    }
}