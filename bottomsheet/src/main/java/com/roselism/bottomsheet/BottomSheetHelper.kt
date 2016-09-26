package com.roselism.bottomsheet

import android.app.Activity
import android.content.ComponentName
import android.content.Intent

/**
 * A helper class,
 *
 */
object BottomSheetHelper {

    fun shareAction(activity: Activity, intent: Intent): BottomSheet.Builder {
        val builder = BottomSheet.Builder(activity).grid()
        val pm = activity.packageManager

        val list = pm.queryIntentActivities(intent, 0)

        for (i in list.indices) {
            builder.sheet(i, list[i].loadIcon(pm), list[i].loadLabel(pm))
        }

        builder.listener { dialog, which ->
            val activityInfo = list[which].activityInfo
            val name = ComponentName(activityInfo.applicationInfo.packageName,
                    activityInfo.name)
            val newIntent = intent.clone() as Intent
            newIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED
            newIntent.component = name
            activity.startActivity(newIntent)
        }
        builder.limit(R.integer.bs_initial_grid_row)
        return builder
    }

}
