/*
 * SPDX-FileCopyrightText: 2023 microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package com.google.android.gms.fitness.request;

import android.os.Parcel;

import androidx.annotation.NonNull;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableCreatorAndWriter;
import com.google.android.gms.fitness.internal.IDataPointChangesCallback;

@SafeParcelable.Class
public class DataPointChangesRequest extends AbstractSafeParcelable {

    @Field(1)
    public IDataPointChangesCallback callback;
    @Field(2)
    public Long unknownLong2;
    @Field(3)
    public int unknownInt3;

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        CREATOR.writeToParcel(this, dest, flags);
    }

    public static final SafeParcelableCreatorAndWriter<DataPointChangesRequest> CREATOR = findCreator(DataPointChangesRequest.class);
}
