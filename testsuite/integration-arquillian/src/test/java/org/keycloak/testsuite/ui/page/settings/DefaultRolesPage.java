/*
 * JBoss, Home of Professional Open Source
 *
 * Copyright 2013 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.keycloak.testsuite.ui.page.settings;

import java.util.ArrayList;
import java.util.List;
import org.keycloak.testsuite.ui.fragment.PickList;
import org.keycloak.testsuite.ui.page.AbstractPage;
import org.keycloak.testsuite.ui.model.Role;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author Petr Mensik
 */
public class DefaultRolesPage extends AbstractPage {
    
    @FindBy(id = "")
    private PickList realmDefaultRoles;
    
    @FindBy(id = "")
    private PickList applicationDefaultRoles;
    
    @FindBy(id = "applications")
    private Select applicationsSelect;
    
    public void addDefaultRealmRoles(String... roles) {
        realmDefaultRoles.addItems(roles);
    }
    
    public void addDefaultRealmRoles(Role... roles) {
        List<String> roleList = new ArrayList<String>();
        for(Role role : roles) {
            roleList.add(role.getName());
        }
        addDefaultRealmRoles(((String []) roleList.toArray()));
    }
}