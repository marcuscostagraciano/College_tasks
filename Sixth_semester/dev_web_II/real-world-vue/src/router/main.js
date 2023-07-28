import { createRouter, createWebHistory } from 'vue-router'
import AboutView from '@/views/AboutView.vue'
import EventListView from '@/views/EventListView.vue'

const routes = [
    { path: '/', name: 'event-list', component: EventListView },
    { path: '/about', name: 'about', component: AboutView },
]

const router = createRouter({
    history: createWebHistory(import.meta.env.BASE_URL),
    routes
})

export default router