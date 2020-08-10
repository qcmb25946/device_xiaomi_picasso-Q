/*
 * Copyright (C) 2020 The LineageOS Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

<<<<<<< HEAD:parts/src/org/lineageos/settings/doze/DozeSettingsActivity.java
package org.lineageos.settings.doze;
=======
package org.lineageos.settings.device.thermal;
>>>>>>> 98e63f8... picasso: fix DeviceSettings:parts/src/org/lineageos/settings/thermal/ThermalActivity.java

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class ThermalActivity extends PreferenceActivity {

    private static final String TAG_THERMAL = "thermal";
    private static final String THERMAL_SCONFIG = "/sys/class/thermal/thermal_message/sconfig";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (FileUtils.fileExists(THERMAL_SCONFIG)) {
            getFragmentManager().beginTransaction().replace(android.R.id.content,
                    new ThermalSettingsFragment(), TAG_THERMAL).commit();
        }
    }
}
