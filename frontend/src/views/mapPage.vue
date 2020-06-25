<template>
    <v-container>
        <div class="map">
            <GmapMap
                    :center="{lat:37.532600, lng:127.024612}"
                    :zoom="7"
                    map-type-id="terrain"
                    style="width: 500px; height: 300px"
            >
                <GmapMarker
                        :key="index"
                        v-for="(m, index) in markers"
                        :position="m.position"
                        :clickable="true"
                        :draggable="true"
                        @click="clickMarker"
                />
            </GmapMap>
            <get-area v-if="step === 1" :selectedArea.sync="selectedArea" :step.sync="step"></get-area>
        </div>
    </v-container>
</template>

<script>
    import GetArea from "./GetArea";

    export default {
        name: 'map',

        components: { GetArea },
        data() {
            return {
                markers: [],

                //course
                step: 1,
                selectedCourse: null,
                selectedClass: null,

                errors: []
            };
        },
        methods: {
            clickMarker: function () {
                this.$dialog.confirm({
                    text: "What's your name? <img src='https://upload.wikimedia.org/wikipedia/commons/thumb/f/fc/Natgeologo.svg/1200px-Natgeologo.svg.png' height=100/><input value='input'></input>", title: 'Warning'});
            },
            mapData: function () {
                this.markers = [{
                    position: {
                        lat:37.532600, lng:127.024612
                    }
                }, {
                    position: {
                        lat:37.532600, lng:129
                    }
                }];
            }
        },
        created() {
            this.mapData();
        }
    };

</script>
