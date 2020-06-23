<template>
    <v-container>
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
    </v-container>
</template>

<script>
    export default {
        name: 'HelloWorld',

        data() {
            return {
                markers: [{
                    position: {
                        lat:37.532600, lng:127.024612
                    }
                }, {
                    position: {
                        lat:37.532600, lng:129
                    }
                }]
            };
        },
        methods: {
            clickMarker: function () {
                this.$dialog.confirm({
                    text: "What's your name? <img src='https://upload.wikimedia.org/wikipedia/commons/thumb/f/fc/Natgeologo.svg/1200px-Natgeologo.svg.png' height=100/><input value='input'></input>", title: 'Warning'});
            }
        }
    };

</script>
