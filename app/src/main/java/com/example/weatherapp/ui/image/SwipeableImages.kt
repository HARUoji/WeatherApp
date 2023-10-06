package com.example.weatherapp.ui.image

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.weatherapp.R


//@Composable
//fun SwipeableImages() {
//    val imageList = ImageLoader()
//
//    LazyRow(
//        horizontalArrangement = Arrangement.spacedBy(16.dp),
//        contentPadding = PaddingValues(horizontal = 16.dp)
//    ) {
//        items(imageList) { imageData ->
//            Image(
//                painter = painterResource(id = imageData.resId),
//                contentDescription = null,
//                modifier = Modifier
//                    .size(imageData.width.dp, imageData.height.dp)
//                    .background(Color.Gray, shape = RoundedCornerShape(4.dp))
//            )
//        }
//    }
//}


@Composable
fun SwipeableImages() {
    val imageList = ImageLoader()
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) {
        items(imageList) { imageData ->
            Image(
                painter = painterResource(id = imageData.resId),
                contentDescription = "",
                modifier = Modifier
                    .padding(imageData.padding.dp)
                    .size(imageData.width.dp, imageData.height.dp)
            )
        }
    }
}