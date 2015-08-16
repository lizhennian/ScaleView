/*
 *  Copyright 2014 Zhennian Li
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.sneagle.scaleview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * An LinnearLayout widget that can scale the child view of ListView according
 * to the screen.
 * Created by lizhennian on 2014/5/29.
 */
public class ScaleLinearLayout extends LinearLayout {
    public ScaleLinearLayout(Context context) {
        super(context);
    }

    public ScaleLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        ScaleCalculator.getInstance().scaleViewGroup(this);
    }
}
