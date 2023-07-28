import { createRouter, createWebHistory } from 'vue-router'
import AboutView from '@/views/AboutView.vue'
import EventDetailsView from '@/views/EventDetailsView.vue'
import EventListView from '@/views/EventListView.vue'

const routes = [
    { path: '/about', name: 'about', component: AboutView },
    { path: '/', name: 'event-list', component: EventListView },
    { path: '/event/:id', name: 'event-details', props: true, component: EventDetailsView },
]

const router = createRouter({
    history: createWebHistory(import.meta.env.BASE_URL),
    routes
})

export default router