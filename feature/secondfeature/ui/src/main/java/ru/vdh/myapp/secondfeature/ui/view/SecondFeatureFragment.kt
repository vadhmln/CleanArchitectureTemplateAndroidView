package ru.vdh.myapp.secondfeature.ui.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import ru.vdh.myapp.core.ui.mapper.ViewStateBinder
import ru.vdh.myapp.core.ui.view.BaseFragment
import ru.vdh.myapp.core.ui.view.ViewsProvider
import ru.vdh.myapp.secondfeature.presentation.model.NewFeaturePresentationNotification
import ru.vdh.myapp.secondfeature.presentation.model.NewFeatureViewState
import ru.vdh.myapp.secondfeature.presentation.viewmodel.SecondFeatureFragmentViewModel
import ru.vdh.myapp.secondfeature.ui.R
import ru.vdh.myapp.secondfeature.ui.databinding.FragmentFeatureSecondBinding

import ru.vdh.myapp.secondfeature.ui.mapper.SecondFeatureDestinationToUiMapper
import ru.vdh.myapp.secondfeature.ui.mapper.NewUserNotificationPresentationToUiMapper
import javax.inject.Inject

@AndroidEntryPoint
class SecondFeatureFragment : BaseFragment<NewFeatureViewState, NewFeaturePresentationNotification>(),
    NewFeatureViewsProvider {

    override val viewModel: SecondFeatureFragmentViewModel by viewModels()

    override val layoutResourceId = R.layout.fragment_feature_second

    @Inject
    override lateinit var destinationMapper:
            SecondFeatureDestinationToUiMapper

    @Inject
    override lateinit var notificationMapper:
            NewUserNotificationPresentationToUiMapper

    @Inject
    @JvmSuppressWildcards
    override lateinit var viewStateBinder:
            ViewStateBinder<NewFeatureViewState, ViewsProvider>
    private var _binding: FragmentFeatureSecondBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)

        _binding = FragmentFeatureSecondBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun View.bindViews() {

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonSecond.setOnClickListener {
            viewModel.onNewFeatureAction(0)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}