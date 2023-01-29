/* Copyright (c) 2023 Kizzy. All rights reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License. 
*/

package com.my.kizzyrpc.model

import com.google.gson.annotations.SerializedName

data class Activity(
    @SerializedName("name")
    val name: String?,
    @SerializedName("state")
    val state: String? = null,
    @SerializedName("details")
    val details: String? = null,
    @SerializedName("type")
    val type: Int? = 0,
    @SerializedName("timestamps")
    val timestamps: Timestamps? = null,
    @SerializedName("assets")
    val assets: Assets? = null,
    @SerializedName("buttons")
    val buttons: List<String?>? = null,
    @SerializedName("metadata")
    val metadata: Metadata? = null,
    @SerializedName("application_id")
    val applicationId: String? = null
)
