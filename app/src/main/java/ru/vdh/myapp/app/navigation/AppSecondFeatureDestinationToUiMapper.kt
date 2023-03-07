package ru.vdh.myapp.app.navigation

import android.util.Log
import androidx.fragment.app.FragmentActivity
import androidx.navigation.fragment.findNavController
import ru.vdh.myapp.NavGraphDirections
import ru.vdh.myapp.R
import ru.vdh.myapp.core.presentation.model.PresentationDestination
import ru.vdh.myapp.core.ui.navigation.model.UiDestination
import ru.vdh.myapp.navigation.mapper.GlobalDestinationToUiMapper
import ru.vdh.myapp.secondfeature.presentation.destination.SecondFeaturePresentationDestination.NewFeature
import ru.vdh.myapp.secondfeature.ui.mapper.SecondFeatureDestinationToUiMapper
import ru.vdh.myapp.secondfeature.ui.mapper.SecondFeatureDestinationToUiMapper.NewFeatureUiDestination

class AppSecondFeatureDestinationToUiMapper(
    private val activity: FragmentActivity,
    private val globalDestinationToUiMapper: GlobalDestinationToUiMapper
) : SecondFeatureDestinationToUiMapper {
    override fun toUi(
        input: PresentationDestination
    ): UiDestination = when (input) {
        is NewFeature -> AppNewFeature(activity, input.id)
        else -> globalDestinationToUiMapper.toUi(input)
    }

    private data class AppNewFeature(
        private val activity: FragmentActivity,
        override val id: Int
    ) : NewFeatureUiDestination(id) {
        override fun navigate() {

            val currentFragment =
                activity.supportFragmentManager.findFragmentById(R.id.nav_host_fragment_content_main)

            currentFragment?.findNavController()
                ?.navigate(NavGraphDirections.actionGlobalToNavNewFeature())
            Log.d("AAA", "Add button clicked!!!")
        }
    }

}
