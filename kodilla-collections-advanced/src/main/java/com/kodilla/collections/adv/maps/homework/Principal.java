package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {
    private String principalname;
    private String schoolname;

    public Principal(String principalname, String schoolname) {
        this.principalname = principalname;
        this.schoolname = schoolname;
    }

    public String getPrincipalname() {
        return principalname;
    }

    public String getSchoolname() {
        return schoolname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Principal principal = (Principal) o;
        return Objects.equals(principalname, principal.principalname)
                && Objects.equals(schoolname, principal.schoolname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(principalname, schoolname);
    }
}
