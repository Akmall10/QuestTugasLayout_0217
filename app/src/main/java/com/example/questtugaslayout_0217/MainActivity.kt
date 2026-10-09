package com.example.questtugaslayout_0217

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import com.example.questtugaslayout_0217.screen.HomeScreen
import com.example.questtugaslayout_0217.ui.theme.QuestTugasLayout_0217Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuestTugasLayout_0217Theme {
                HomeScreen()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    QuestTugasLayout_0217Theme {
        HomeScreen()
    }
}
