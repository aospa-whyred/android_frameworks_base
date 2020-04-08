/*
 * Copyright (C) 2020 The Android Open Source Project
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

package android.content.pm;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.content.ComponentName;
import android.content.LocusId;
import android.os.Parcel;
import android.os.Parcelable;

import com.android.internal.util.DataClass;

import java.util.ArrayList;
import java.util.List;

/**
 * @hide
 */
@DataClass(genParcelable = true, genToString = true)
public final class ShortcutQueryWrapper extends LauncherApps.ShortcutQuery implements Parcelable {

    public ShortcutQueryWrapper(LauncherApps.ShortcutQuery query) {
        this();
        mChangedSince = query.mChangedSince;
        mPackage = query.mPackage;
        mLocusIds = query.mLocusIds;
        mShortcutIds = query.mShortcutIds;
        mActivity = query.mActivity;
        mQueryFlags = query.mQueryFlags;
    }

    public long getChangedSince() {
        return mChangedSince;
    }

    @Nullable
    public String getPackage() {
        return mPackage;
    }

    @Nullable
    public List<LocusId> getLocusIds() {
        return mLocusIds;
    }

    @Nullable
    public List<String> getShortcutIds() {
        return mShortcutIds;
    }

    @Nullable
    public ComponentName getActivity() {
        return mActivity;
    }

    public int getQueryFlags() {
        return mQueryFlags;
    }

    // Code below generated by codegen v1.0.14.
    //
    // DO NOT MODIFY!
    // CHECKSTYLE:OFF Generated code
    //
    // To regenerate run:
    // $ codegen $ANDROID_BUILD_TOP/frameworks/base/core/java/android/content/pm/ShortcutQueryWrapper.java
    //
    // To exclude the generated code from IntelliJ auto-formatting enable (one-time):
    //   Settings > Editor > Code Style > Formatter Control
    //@formatter:off


    @DataClass.Generated.Member
    public ShortcutQueryWrapper() {

        // onConstructed(); // You can define this method to get a callback
    }

    @Override
    @DataClass.Generated.Member
    public String toString() {
        // You can override field toString logic by defining methods like:
        // String fieldNameToString() { ... }

        return "ShortcutQueryWrapper { " +
        " }";
    }

    @Override
    @DataClass.Generated.Member
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        // You can override field parcelling by defining methods like:
        // void parcelFieldName(Parcel dest, int flags) { ... }

        byte flg = 0;
        if (mPackage != null) flg |= 0x2;
        if (mShortcutIds != null) flg |= 0x4;
        if (mLocusIds != null) flg |= 0x8;
        if (mActivity != null) flg |= 0x10;
        dest.writeByte(flg);
        dest.writeLong(mChangedSince);
        if (mPackage != null) dest.writeString(mPackage);
        if (mShortcutIds != null) dest.writeStringList(mShortcutIds);
        if (mLocusIds != null) dest.writeParcelableList(mLocusIds, flags);
        if (mActivity != null) dest.writeTypedObject(mActivity, flags);
        dest.writeInt(mQueryFlags);
    }

    @Override
    @DataClass.Generated.Member
    public int describeContents() { return 0; }

    /** @hide */
    @SuppressWarnings({"unchecked", "RedundantCast"})
    @DataClass.Generated.Member
    /* package-private */ ShortcutQueryWrapper(@NonNull Parcel in) {
        // You can override field unparcelling by defining methods like:
        // static FieldType unparcelFieldName(Parcel in) { ... }

        byte flg = in.readByte();
        long changedSince = in.readLong();
        String pkg = (flg & 0x2) == 0 ? null : in.readString();
        List<String> shortcutIds = null;
        if ((flg & 0x4) != 0) {
            shortcutIds = new ArrayList<>();
            in.readStringList(shortcutIds);
        }
        List<LocusId> locusIds = null;
        if ((flg & 0x8) != 0) {
            locusIds = new ArrayList<>();
            in.readParcelableList(locusIds, LocusId.class.getClassLoader());
        }
        ComponentName activity = (flg & 0x10) == 0 ? null
                : (ComponentName) in.readTypedObject(ComponentName.CREATOR);
        int queryFlags = in.readInt();

        this.mChangedSince = changedSince;
        this.mPackage = pkg;
        this.mShortcutIds = shortcutIds;
        this.mLocusIds = locusIds;
        this.mActivity = activity;
        this.mQueryFlags = queryFlags;
        com.android.internal.util.AnnotationValidations.validate(
                QueryFlags.class, null, mQueryFlags);

        // onConstructed(); // You can define this method to get a callback
    }

    @DataClass.Generated.Member
    public static final @NonNull Parcelable.Creator<ShortcutQueryWrapper> CREATOR
            = new Parcelable.Creator<ShortcutQueryWrapper>() {
        @Override
        public ShortcutQueryWrapper[] newArray(int size) {
            return new ShortcutQueryWrapper[size];
        }

        @Override
        public ShortcutQueryWrapper createFromParcel(@NonNull Parcel in) {
            return new ShortcutQueryWrapper(in);
        }
    };

    @DataClass.Generated(
            time = 1582049937960L,
            codegenVersion = "1.0.14",
            sourceFile = "frameworks/base/core/java/android/content/pm/ShortcutQueryWrapper.java",
            inputSignatures = "public  long getChangedSince()\npublic @android.annotation.Nullable java.lang.String getPackage()\npublic @android.annotation.Nullable java.util.List<android.content.LocusId> getLocusIds()\npublic @android.annotation.Nullable java.util.List<java.lang.String> getShortcutIds()\npublic @android.annotation.Nullable android.content.ComponentName getActivity()\npublic  int getQueryFlags()\nclass ShortcutQueryWrapper extends android.content.pm.LauncherApps.ShortcutQuery implements [android.os.Parcelable]\n@com.android.internal.util.DataClass(genParcelable=true, genToString=true)")
    @Deprecated
    private void __metadata() {}


    //@formatter:on
    // End of generated code

}
