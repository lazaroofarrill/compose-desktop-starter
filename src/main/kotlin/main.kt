import androidx.compose.desktop.Window
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.svgResource
import androidx.compose.foundation.Image
import androidx.compose.ui.Modifier

fun main() = Window {
    var text by remember { mutableStateOf("Hello, World!") }

    MaterialTheme {
        Button(onClick = {
            text = "I hope you didn't click me"
        }) {
            Text(text)
        }
    }
//    Image(
//        painter = svgResource("img/binoculars.svg"),
//        contentDescription = "Binoculars Icons",
//        modifier = Modifier.fillMaxSize()
//    )
}
