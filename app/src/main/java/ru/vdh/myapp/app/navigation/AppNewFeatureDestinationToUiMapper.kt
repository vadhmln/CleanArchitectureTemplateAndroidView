package ru.vdh.myapp.app.navigation

import android.util.Log
import androidx.fragment.app.FragmentActivity
import androidx.navigation.fragment.findNavController
import ru.vdh.myapp.NavGraphDirections
import ru.vdh.myapp.R
import ru.vdh.myapp.core.presentation.model.PresentationDestination
import ru.vdh.myapp.core.ui.navigation.model.UiDestination
import ru.vdh.myapp.navigation.mapper.GlobalDestinationToUiMapper
import ru.vdh.myapp.newfeature.presentation.destination.NewFeaturePresentationDestination
import ru.vdh.myapp.newfeature.ui.mapper.NewFeatureDestinationToUiMapper
import ru.vdh.myapp.newfeature.ui.mapper.NewFeatureDestinationToUiMapper.SecondFeatureUiDestination

class AppNewFeatureDestinationToUiMapper(
    private val activity: FragmentActivity,
    private val globalDestinationToUiMapper: GlobalDestinationToUiMapper
) : NewFeatureDestinationToUiMapper {
    override fun toUi(
        input: PresentationDestination
    ): UiDestination = when (input) {
        is NewFeaturePresentationDestination.SecondFeature -> AppSecondFeature(activity, input.id)
        else -> globalDestinationToUiMapper.toUi(input)
    }

    private data class AppSecondFeature(
        private val activity: FragmentActivity,
        override val id: Int
    ) : SecondFeatureUiDestination(id) {
        override fun navigate() {

            val currentFragment =
                activity.supportFragmentManager.findFragmentById(R.id.nav_host_fragment_content_main)

            currentFragment?.findNavController()
                ?.navigate(NavGraphDirections.actionGlobalToNavSecondFeature())
            Log.d("AAA", "Add button clicked!!!")
        }
    }

}
