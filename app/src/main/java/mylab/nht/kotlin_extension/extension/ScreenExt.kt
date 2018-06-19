package mylab.nht.kotlin_extension.extension

import android.content.Context
import android.content.res.Resources


fun Any.dp2Pixel(c: Context, dp: Float): Float {
    val density = c.resources.displayMetrics.density
    return dp * density
}


fun Any.pixel2Dp(c: Context, pixel: Float): Float {
    val density = c.resources.displayMetrics.density
    return pixel / density
}


fun getScreenWidth(): Int {
    return Resources.getSystem().displayMetrics.widthPixels
}


fun getScreenHeight(): Int {
    return Resources.getSystem().displayMetrics.heightPixels
}