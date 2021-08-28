package com.example.smartframework.binding.image

import android.text.TextUtils
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.example.smartframework.utils.GlideLoadUtils

object ViewAdapter {
    @kotlin.jvm.JvmStatic
    @BindingAdapter(value = ["imgUrl", "placeholderRes", "round"], requireAll = false)
    fun setImageUri(imageView: ImageView, url: String?, placeholderRes: Int, round: Int) {
        if (!TextUtils.isEmpty(url)) {
            //使用Glide框架加载图片
            GlideLoadUtils.loadRoundCornerImg(imageView, url, placeholderRes, round)
        }
    }
}