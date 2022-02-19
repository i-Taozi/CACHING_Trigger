// Copyright 2008, 2011 The Apache Software Foundation
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.apache.tapestry5.integration.app1.pages;

import org.apache.tapestry5.annotations.Component;
import org.apache.tapestry5.annotations.SessionState;
import org.apache.tapestry5.corelib.components.BeanEditor;
import org.apache.tapestry5.corelib.components.Form;
import org.apache.tapestry5.integration.app1.data.RegistrationData;

public class BeanEditorOverride
{
    @Component
    private Form form;

    @Component(parameters =
    { "object=registrationData" })
    private BeanEditor editor;

    @SessionState
    private RegistrationData data;

    public RegistrationData getRegistrationData()
    {
        return data;
    }

    Object onSuccess()
    {
        return ViewRegistration.class;
    }

    void onActionFromClear()
    {
        data = null;
        form.clearErrors();
    }
}
