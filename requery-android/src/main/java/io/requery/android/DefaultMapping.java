/*
 * Copyright 2016 requery.io
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

package io.requery.android;

import android.location.Location;
import android.os.ParcelUuid;
import io.requery.sql.GenericMapping;
import io.requery.sql.Platform;

/**
 * Extended {@link io.requery.sql.Mapping} with useful {@link io.requery.Converter}s added
 * specifically for Android.
 */
public class DefaultMapping extends GenericMapping {
    public DefaultMapping(Platform platform) {
        super(platform);
        addConverter(new UriConverter());
        addConverter(new ParcelConverter<>(ParcelUuid.class, ParcelUuid.CREATOR));
        addConverter(new ParcelConverter<>(Location.class, Location.CREATOR));
    }
}
